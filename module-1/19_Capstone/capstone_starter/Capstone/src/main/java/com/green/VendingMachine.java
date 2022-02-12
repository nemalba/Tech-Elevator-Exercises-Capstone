package com.green;

public interface VendingMachine {
    //Vending machine is a key class which is an interface contains the methods in interacting with the user
    void displayProducts(); // A method to display the products that will not return anything

    //We need to pass to the vending machine the product selected by the user; the method does not need to return anything
    void selectProduct(int product); //the argument product is the product selected by the user

    //Method to ask user to enter coins
    void displayEnterCoinsMessage();

    //We need to pass to the vending machine the coins entered by the user
    void enterCoins(int[] coins);// the argument coins which array of integers representing the coins entered

    //the vending machine will need to display the message indicating the change
    void displayChangeMessage();
}
