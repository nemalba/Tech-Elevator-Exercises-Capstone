package com.techelevator.scanner;

import com.techelevator.Apartment;
import com.techelevator.Condo;
import com.techelevator.Dwelling;
import com.techelevator.House;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();
		try(Scanner fileScanner = new Scanner(inputFile)) { // when this block ended, the fileScanner object was deleted
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String rtn = line.substring(0, 9);
				
				if(checksumIsValid(rtn) == false) {
					System.out.println(line);
				}
			}
		}

		List<Dwelling> propertyList = new ArrayList<>()
;		File dwellingFile = getInputFileFromUser();  // ask the user to enter the file name
		try (Scanner fileScanner = new Scanner(dwellingFile)) {  // try with resources will close the file when I'm done!
			while (fileScanner.hasNextLine()) {  // while there is more content to pick up from the file
				String line = fileScanner.nextLine();  // picks up one line from the file
//				System.out.println(line);
				String[] lineArray = line.split(",");  // split into an array of strings on the comma
				if(lineArray[0].contains("Condo")){
					Condo condo = new Condo(lineArray[0], Integer.parseInt(lineArray[1]),
							Integer.parseInt(lineArray[2]),
							Double.parseDouble(lineArray[3]),
							new BigDecimal(lineArray[4]),
							new BigDecimal(lineArray[5]));
					propertyList.add(condo);
				}else if (lineArray[0].contains("Apartment")){
					Apartment apartment = new Apartment(lineArray[0], Integer.parseInt(lineArray[1]),
							Integer.parseInt(lineArray[2]),
							Double.parseDouble(lineArray[3]),
							new BigDecimal(lineArray[4]),
							new BigDecimal(lineArray[5]));
					propertyList.add(apartment);
				} else {
					House house = new House(lineArray[0], Integer.parseInt(lineArray[1]),
							Integer.parseInt(lineArray[2]),
							Double.parseDouble(lineArray[3]),
							new BigDecimal(lineArray[4]),
							new BigDecimal(lineArray[5]));
					propertyList.add(house);
				}
			}
		}

		// loop through the property list and print out the address and square footage
		for (Dwelling prop: propertyList){
	/*		System.out.println(prop.getClass().getSimpleName() + "  " +
					prop.getAddress() + "   " + prop.getSquareFootage() + "sf");*/
			System.out.printf("%-20s %-30s  %-10s\n", prop.getClass().getSimpleName(),
					prop.getAddress(), prop.getSquareFootage());
		}

	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);  //connects the app to the keyboard
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);  // create a File object from that string
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {  // maybe a directory
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
