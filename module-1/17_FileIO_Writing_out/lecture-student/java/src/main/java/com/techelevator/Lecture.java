package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */


		System.out.println("Enter the path of a file or directory: ");
		String path = userInput.nextLine();

		File file = new File(path);

		if(file.exists()){
			System.out.println("Name:" + file.getName());
			System.out.println("Absolute path");

			if(file.isFile()){
				System.out.println("type: File");
			}
			System.out.println("Size: " + file.lastModified());
		}

		System.out.println();


	}

}
