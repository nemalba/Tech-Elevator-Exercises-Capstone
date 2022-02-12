package com.techelevator.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // this scanner object will be for user input

        // loop to reprompt if the user enters a file name incorrectly
        boolean isDone = false;
        Scanner fileScanner; // declare but not initialize the Scanner to the file up here
        do {
            System.out.print("Enter the file name: ");
            String path = userInput.nextLine();
            File inputPath = new File(path);  // File inputPath = new File(userInput.nextLine());
            try {
                fileScanner = new Scanner(inputPath);  // this creates a scanner object to the file
                System.out.println("File opened for reading");
                isDone = true;
            } catch (FileNotFoundException e) {
                System.out.println("Uh oh!  File not found! Try again!");
            }
        } while (!isDone);

        // what if I want to READ the file down here???


        // need access to the fileScanner object.
    }
}
