package com.green;

import java.util.Scanner;

public class Main {
    //This the entry point of the program, and orchestrates call to the classes. It contains the main method.
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);  //Scanner class will receive input from the user

        //To be able to use the Vending machine we have to connect to that class
       // VendingMachine vendingMachine = null;//not initialized yet coz we have not implemented the class yet,
        // we just created the interface

        //After creating the TextBasedVendingMachine class that implements VendingMachine, we can comment out the
        //VendingMachine vendingMachine = null; and change it to
        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts(); //called this displayProducts method to display the products to the user
        String selectedProduct = scanner.nextLine();//scanner.nextLine reads the product selected by the user
        //The selected product is a String right now
        //convert it to an int to pass it to the Vending machine void selectProduct(int product) method which has an int parameter;
        int selectedProductNumber = Integer.parseInt(selectedProduct);
        vendingMachine.selectProduct(selectedProductNumber); // call the selectProduct method and pass on the int selected product

        //Request the user to enter the coins to pay for the product selected
        vendingMachine.displayEnterCoinsMessage();

        //The user will enter the coins & it will be a String right now
        String userEnterCoins = scanner.nextLine();
        //Convert it to an array
        int[] enteredCoins = Coin.parseCoins(userEnterCoins) ; // TODO will do this later

        vendingMachine.enterCoins(enteredCoins); //passing the coins entered to the vending machine and pass in as argument "enteredCoins"

        //Display the change message
        vendingMachine.displayChangeMessage();

        //Next step is to complete the implementations of our vending machine
    }
}
