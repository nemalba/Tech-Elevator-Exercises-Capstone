package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class WordSearch {
	// you'll write a program that searches the contents of a file for a word.
	// For each occurrence of the word in the file, you'll display the line number and the contents of that line in the console.

	/*Note all statements from methods should be inside the main method for the program
	   to pass the tests & will get back to it later today.
	*/
	public static void main(String[] args) throws FileNotFoundException {

		//	File inputFile = getFileFromUser(); // call the getFileFromUserMethod
		//	String word = wordToSearch();
		//	searchForWord(inputFile, word);

		Scanner myReader = new Scanner(System.in);
		System.out.println("Please enter the file path: ");
		String path = myReader.nextLine();

		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " does not exist.");
			System.exit(1);

		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file.");
			System.exit(1);

		}

		//Word Search
		System.out.println("Please enter the word to search: ");
		String searchWord = myReader.nextLine();

		//Word lowercase? search
		System.out.println("Is the word your searching case sensitive? (Y) for Yes or (N)o for No ");
		String answer = myReader.nextLine().toLowerCase();

		try ( Scanner input = new Scanner (inputFile)) {

			int i = 0;

			while (input.hasNextLine())
			{
				i++;
				String data = input.nextLine();
				if (answer.startsWith("n")) {

					//String data = myReader.nextLine();
					if (data.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(i + ") " + data);
					}
				}
				else {

						if (data.contains(searchWord)) {
							System.out.println(i + ") " + data);
						}
					}
				}
			}
		catch (FileNotFoundException e) {

			System.out.println("The file does not exist.");
		}

	}
}








