package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.println("Enter the discount amount (w/out percentage): ");

        System.out.println("Enter a discount amount: ");
        String discountAmountString = scanner.nextLine();
        double discountAmount = Double.parseDouble(discountAmountString);
                discountAmount = discountAmount /100;
        System.out.println("The discount amount is: " + discountAmount);



        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String priceString = scanner.nextLine();
        System.out.println(priceString);
        String [] pricesArray = priceString.split(" ");
        for (int i=0; i< pricesArray.length; i++){
            System.out.println(pricesArray[i]);
            double price = Double.parseDouble(pricesArray[i]);

            double amountOff = price * discountAmount;
            double salePrice = price * amountOff;
            System.out.println("Original price: " + price + " Discount Amount"  + amountOff + " Sales Price: " + salePrice);
        }







    }

}