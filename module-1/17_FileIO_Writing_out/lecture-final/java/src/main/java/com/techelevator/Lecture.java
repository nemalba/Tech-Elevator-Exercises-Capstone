package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
		System.out.print("Enter the path of a file or directory>> ");
		String path = userInput.nextLine();

		File file = new File(path);

		if (file.exists()){
			System.out.println("Name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());


			try {
				System.out.println("Canonical path: " + file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}


			System.out.println("Readable: " + file.canRead());
			System.out.println("Writeable: " + file.canWrite());

			if (file.isDirectory()){
				System.out.println("type: Directory");
				System.out.println(Arrays.toString(file.listFiles()));
			}

			if (file.isFile()){  // could have just used else here
				System.out.println("type: File");
			}

			System.out.println("Size: " + file.length());  // lenght returns number of bytes

		}

		System.out.println("Let's create a new file!");
		System.out.print("Enter the name of the file you wish to create>> ");
		String newPath = userInput.nextLine();
		File newFile = new File(newPath);  // this just creates a File object
		try {
			newFile.createNewFile(); // this will actually create the file in the OS
		} catch (IOException e) {
			System.out.println("Error creating file!");
		}

		System.out.println("Let's create a Directory!");
		System.out.print("Enter the name of the directory you wish to create>> ");
		File newDirectory = new File(userInput.nextLine());


		if (newDirectory.exists()){
			System.out.println("Sorry, directory already exists");
		} else {
			if (newDirectory.mkdir()) {  // return true if able to create directory
				System.out.println("New directory created!");
			} else {
				// if the directory already exists, you will not be able to create it
				System.out.println("Unable to create directory!");
				// if we wanted to end
//				System.exit(1);  // status is either 0 or 1 -- they both do the same thing
			}
		}

		// File constructor will let me pass in 2 params
								// 1 is the directory name -- which must exist or will error
								// 2 is the file name of the file to be created
		File fileInDirectory = new File("myDirectory", "myFile.txt");

		try {
			fileInDirectory.createNewFile();
		} catch (IOException e) {
			System.out.println("File could not be created!");
		}


		//let's use the File object fileInDirectory to write contents to
//		PrintWriter writer = new PrintWriter(fileInDirectory);
		try (PrintWriter writer = new PrintWriter(fileInDirectory)){
			while(true){
				System.out.print("Enter text to write to the file>> ");
				String input = userInput.nextLine();

				//writer.print(), writer.println(), writer.printf()
				writer.println(input);  // sends the line of text to the buffer

				// ask the user if they wish to add more to the file
				System.out.print("Do you wish to enter more text? (y/n)>> ");
				if (userInput.nextLine().startsWith("n")){
					break;  // break out of the while loop
				}
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found!");
		}
	}

}
