package com.green;

public enum Product {
    /*
    Products class represents the diff. products available in our vending machine
This is an enum type. An enum is a special "class" that represents a group of constants (unchangeable variables,
like final variables).
To create an enum , use the enum keyword (instead of class or interface), and separate the constants with a comma.
We assume that products and its properties such as price and name will not change and therefore it makes
sense to use an enum type to define it.
     */

    TWIX(1,100), COKE(2,50), WATER(3, 30), SANDWICH(4, 150);
      //Two important pieces of information

    private int id;
    private int price;

    //Create the constructor
    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    // Create getters to access the instance variables or fields. We do this to implement encapsulation

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }


    //this method was added not a part of the getter
    //Since we need to work out how much money to return we need to know the price of the selected product
    //to do so we need to add another method to our Product class called valueof()
    public static Product valueOf(int productSelected)
    //passing a product identifier productSelected this method will return the corresponding product
    {
      for(Product product: Product.values()){
          if(productSelected == product.getId()){
              return product;
          }
      }
      return null;
    }
}
