package com.green;

public interface CoinCalculator {
    //Calculator class function is to do calculations like the total amount of coins or money entered by the user
    // and also calculated the minimum number of coins or change returned to the user

    //CoinBundle class contains all coins entered
    int calculateTotal(CoinBundle enteredCoins);// returns an integer which is the total amount
  // the amounts will be expressed in cents
    //this method will return an integer

    CoinBundle calculateChange(int amountMoneyToReturn);//takes a parameter the amount in cents to return to the user
    //and return an object CoinBundle which represents the coins to return to the user.
}
