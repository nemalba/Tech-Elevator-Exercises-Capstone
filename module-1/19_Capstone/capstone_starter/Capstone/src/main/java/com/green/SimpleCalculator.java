package com.green;

public class SimpleCalculator implements CoinCalculator{
    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;

        change.number100CentsCoins = remainingAmount /100;
        remainingAmount = remainingAmount % 100;

        change.number50CentsCoins = remainingAmount /50;
        remainingAmount = remainingAmount % 50;

        change.number20CentsCoins = remainingAmount /20;
        remainingAmount = remainingAmount % 20;

        change.numbe10CentsCoins = remainingAmount /10;
        remainingAmount = remainingAmount % 10;

        change.number5CentsCoins = remainingAmount /5;
        remainingAmount = remainingAmount % 5;

        return change;
    }
}
