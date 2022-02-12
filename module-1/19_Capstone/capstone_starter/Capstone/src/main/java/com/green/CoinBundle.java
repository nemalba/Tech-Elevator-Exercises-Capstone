package com.green;

public class CoinBundle {
  //Contains all coins entered
    //This class will have 5 different fields or instance variables for every different coins

    //number of 5 cents coins
    public int number5CentsCoins;

    //number of 10 cents coins
    public int numbe10CentsCoins;

    //number of 20 cents coins
    public int number20CentsCoins;

    //number of 50 cents coins
    public int number50CentsCoins;

    //number of 100 cents coins
    public int number100CentsCoins;

    public CoinBundle(int[] enteredCoins) {
        this.number5CentsCoins = enteredCoins[0];
        this.numbe10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];
    }

    public int getTotal(){
        int total = 0;
        total = total + this.number5CentsCoins * 5;
        total = total + this.numbe10CentsCoins* 10;
        total = total + this.number20CentsCoins * 20;
        total = total + this.number50CentsCoins * 50;
        total = total + this.number100CentsCoins * 100;

        return total;
    }

}
