package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.model.Order;

public class Module1CodingAssessment {

	public static void main(String[] args) {

		//4
		Order testOrder = new Order("Test", 2);
		System.out.println(testOrder);

		//8
		File orderFile = new File("FlowerInput.csv");
		List<Order> ordersList = new ArrayList<Order>();

		try (Scanner fileScan = new Scanner(orderFile)) {

			while (fileScan.hasNextLine()) {

				String line = fileScan.nextLine();
				String[] lineArr = line.split("\\,");
				
				// The input file had some blank spaces at the end of the line, 
				// so we need to use trim().
				Order order = new Order(lineArr[0], Integer.parseInt(lineArr[1].trim()));
				ordersList.add(order);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Couldn't read file.");
		}

		//9 (See new method below)
		String dollarTotal = printTotal(ordersList);
		System.out.println(dollarTotal);

	}

	public static String printTotal(List<Order> ordersList) {
		BigDecimal total = BigDecimal.ZERO;

		for (Order order : ordersList) {
			total = total.add(order.getSubTotal());
		}

		total = total.setScale(2, RoundingMode.HALF_UP);
		return "$" + total.toString();
	}

	// 5
	public static BigDecimal getDeliveryFee(boolean sameDay, int zipNum) {

		BigDecimal delivFee;
		BigDecimal sameDayFee = new BigDecimal(5.99);

		// This makes the if statements we are about to write less wordy.
		// It will also help to waive all delivery fees:

		boolean twentyThousands = zipNum >= 20000 && zipNum <= 29999;
		boolean thirtyThousands =zipNum >= 30000 && zipNum <= 39999;
		boolean tenThousands = zipNum >= 10000 && zipNum <= 19999;
		boolean sameDayEligibleZip = twentyThousands || thirtyThousands || tenThousands;

		// Using the booleans above:
		if (twentyThousands) {
			delivFee = new BigDecimal(3.99);

		} else if (thirtyThousands) {
			delivFee = new BigDecimal(6.99);

		} else if (tenThousands) {
			delivFee = BigDecimal.ZERO;

		} else {
			delivFee = new BigDecimal(19.99);
		}

		delivFee = (sameDay && !tenThousands && sameDayEligibleZip) ? delivFee.add(sameDayFee) : delivFee;

		return delivFee.setScale(2, RoundingMode.HALF_UP);
	}


}
