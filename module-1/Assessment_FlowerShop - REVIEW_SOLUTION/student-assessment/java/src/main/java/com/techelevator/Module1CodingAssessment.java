package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FlowerShopOrder order = new FlowerShopOrder("standard", 10);

		System.out.println(order.getBouquetType());
		System.out.println(order.getNumberOfRoses());
		System.out.println(order.getSubtotal());

		System.out.println(order);
		System.out.println(order.calculateDeliveryTotal(true, "21000"));

		// read in the csv file
		File file = new File("data-files/FlowerInput.csv");

		List<FlowerShopOrder> myList = new ArrayList<>();

		try {
			Scanner fileInput = new Scanner(file);
			while (fileInput.hasNext()){
				String line = fileInput.nextLine();
				String[] lineArr = line.split(",");
				FlowerShopOrder temp = new FlowerShopOrder(lineArr[0], Integer.parseInt(lineArr[1]));
				myList.add(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BigDecimal subtotal = new BigDecimal("0");
		for (FlowerShopOrder flower: myList){
			System.out.println(flower);
			subtotal = subtotal.add(flower.getSubtotal());
		}
		System.out.println("SUBTOTAL - " + subtotal.setScale(2, RoundingMode.HALF_UP));
	}

}
