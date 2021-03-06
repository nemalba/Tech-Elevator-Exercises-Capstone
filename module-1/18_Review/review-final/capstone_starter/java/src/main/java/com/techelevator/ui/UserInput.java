package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput
{
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption()
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("1) List all instructors");
        System.out.println("2) Add a new instructor");
        System.out.println("3) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        switch (option) {
            case "1":
                return "list";
            case "2":
                return "add";
            case "3":
                return "exit";
            default:
                return "";
        }

    }


    public static void pause(){
        System.out.print("Press enter to continue ");
        String enter = scanner.nextLine();
    }

    
}
