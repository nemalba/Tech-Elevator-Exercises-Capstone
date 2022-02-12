package com.techelevator.farm;

import java.math.BigDecimal;

public class Apple implements Sellable{
    @Override
    public BigDecimal getPrice() {
        //BigDecimal is java's class for money
        BigDecimal pricePerApple = new BigDecimal("0.49");

        return pricePerApple;
    }
}
