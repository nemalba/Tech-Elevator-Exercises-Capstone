package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
/*
Write a command-line program which prompts the user for a series of decimal integer values separated by spaces.
Each decimal integer is displayed along with its equivalent binary value.

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		//String decimalValuesEntered = scanner.nextLine();
		String valuesEntered = scanner.nextLine();
		System.out.println();

		//String[] decimalValuesSeperated = decimalValuesEntered.split(" ");
		String[] valuesEnteredSeparated = valuesEntered.split(" ");

		for(int i = 0;  i < valuesEnteredSeparated .length ; i++) {
			int numberEntered = Integer.parseInt(valuesEnteredSeparated [i]);
			System.out.println(numberEntered + " in binary is " + Integer.toBinaryString((Integer.parseInt(valuesEnteredSeparated[i]))));
		}

	}

}
