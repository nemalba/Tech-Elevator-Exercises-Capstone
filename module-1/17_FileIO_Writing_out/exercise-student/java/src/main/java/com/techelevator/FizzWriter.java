package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the destination file: ");
		String destinationfile = scanner.nextLine();

		File theFile = new File(destinationfile);

		try{
			theFile.createNewFile();

		} catch (IOException e) {
			System.out.println("Error in creating the file!");

		}
	/*
		if (!theFile.exists())  {
			System.out.println("The file does not exist!");
			System.exit(1);
		}
*/
	 try (
		    PrintWriter printWriter = new PrintWriter(destinationfile)){
			for (int i = 1; i <=300; i++)
			{

				if(i % 3 == 0 && i % 5 == 0)
				printWriter.println("FizzBuzz");
				else if (i % 3 == 0)
					printWriter.println("Fizz");
				else if (i % 5 == 0)
				printWriter.println("Buzz");
			    else
			    	printWriter.println(i);
			}

			System.out.println(destinationfile + " The file has been overwritten!");

		} catch (FileNotFoundException e) {
			System.out.println("Error: Destination file not found.");
		}

	}

}
