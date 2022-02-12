package com.techelevator.logger;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class LoggerDemo {
    public static void main(String[] args) {
        // create an object of the Logger class
        Logger logger = new Logger("myLog.txt");

        String nowTime = LocalDateTime.now().toString();
        logger.write(nowTime + " >> Opening log session");

        // write some text from the user to the log file
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text to be written>> ");
        String text = input.nextLine();

        logger.write(LocalDateTime.now().toString() + " >> " + text);

        try {
            logger.close();
        } catch (IOException e) {
            System.out.println("Error closing file");
        }

    }
}
