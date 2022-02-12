package com.green;

public class TextBasedVendingMachine implements VendingMachine{

    private int selectedProduct;  // holds the value of the product selected by the user
    private CoinBundle change ; // this holds the change that we can use later on

    @Override
    public void displayProducts() {
        //This method displays a Welcome Message and also all the products available so the user can select
        System.out.println("***************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE    ");
        System.out.println("***************************************");

        System.out.println("     Products Available                ");
        System.out.println("                                       ");

        for(Product product: Product.values()){
            System.out.println("       " + product.getId()+ " " + product.name() + " -Price: " + product.getPrice());
        }

        System.out.println("                                        ");
        System.out.println(" Please select your product: ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;

    }

    @Override
    //request the user to enter the coins and will also display a brief explanation how the coins info be inserted
    public void displayEnterCoinsMessage() {
        System.out.println("Please enter coins as follows: ");
        System.out.println(" num of 5 cents coins, num of 10 cents coins, num of 20 cents coins, num of 50 cents coins, num of 100 cents coins.");
        System.out.println("                                                 ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,2,0,0,0");
        System.out.println("Please enter coins:");
    }

    @Override
    //This method will receive the coins entered, calculate the total amount inserted and then work out the change
    public void enterCoins(int[] coins) {
        //First create the CoinCalculator object
        //CoinCalculator calculator = null; // this was change to after creating the SimpleCalculator class
        CoinCalculator calculator = new SimpleCalculator();

                //We can call the calculator method and this will return the user money amount
        //Since we need to work out how much money to return we need to know the price of the selected product
        //to do so we need to add another method to our Product class called valueof()
       Product product = Product.valueOf(this.selectedProduct);

       //access the price
        int total = calculator.calculateTotal(new CoinBundle(coins));
        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                    ");
        System.out.println("Your change is: " + change.getTotal() + "cents splitted as follows: ");
        System.out.println(" 100 cents coins: " + change.number100CentsCoins);
        System.out.println(" 50 cents coins: " + change.number50CentsCoins);
        System.out.println(" 20 cents coins: " + change.number20CentsCoins);
        System.out.println(" 10 cents coins: " + change.numbe10CentsCoins);
        System.out.println(" 5 cents coins: " + change.number5CentsCoins);


    }
    //Uses encapsulation principle which allows you to write cleaner code

}
