package com.techelevator;


import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     * This application will ask for discount amount (20)
     * and then a list of prices and calculate the discount
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // I now have a connection to the keyboard called scanner

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        System.out.print("Enter the discount amount (w/out percentage): ");

        // wait for the user to enter something
        String discountAmountString = scanner.nextLine();  // scanner.nextLine() returns a String

        // parse or convert the userInput into a Double so we can do math!
        // The answer needs to be saved as a double
        double discountAmount = Double.parseDouble(discountAmountString);
        System.out.println("Discount Amount is " + discountAmount);

        // turn it into a percentage
        discountAmount = discountAmount / 100;  // discount /= 100;
        System.out.println("Discount amount is now " + discountAmount);
        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        // get the user input from the scanner
        String priceString = scanner.nextLine();  // get the input from the user
        System.out.println(priceString); // print out what the user types in

        // convert the prices into an array so I can then do math on each price
        String[] pricesArray = priceString.split(" "); // regex was added by intelliJ, not me!

        // need a for loop to loop through the elements in the array
        for(int i = 0; i < pricesArray.length; i++){
//            System.out.println(pricesArray[i]);  // for debugging purposes
            double price = Double.parseDouble(pricesArray[i]);  // convert each element value to a double

            // calculate the discount amount
            double amountOff = price * discountAmount;
            double salePrice = price - amountOff;

//            System.out.println("Original price: " + price + " Discount Amount: " +
//                    amountOff + " Sales Price: " + salePrice);
            System.out.printf("Original price: %.2f Discount Amount: %.2f  Sales Price: %.2f\n", price, amountOff, salePrice);
        }


    }

}