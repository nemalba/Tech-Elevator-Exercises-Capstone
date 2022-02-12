package com.techelevator;

import java.math.BigDecimal;

public class Condo extends Dwelling{
    public Condo(String address, int squareFootage,
                 int numberOfBedrooms, double numberOfBathrooms,
                 BigDecimal monthlyPrice, BigDecimal deposit) {
        super(address, squareFootage,
                numberOfBedrooms, numberOfBathrooms,
                monthlyPrice, deposit);
    }
}
