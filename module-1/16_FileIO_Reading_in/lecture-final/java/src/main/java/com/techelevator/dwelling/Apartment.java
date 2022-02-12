package com.techelevator;

import java.math.BigDecimal;

public class Apartment extends Dwelling{
    public Apartment(String address, int squareFootage,
                     int numberOfBedrooms, double numberOfBathrooms,
                     BigDecimal monthlyPrice, BigDecimal deposit) {
        super(address, squareFootage, numberOfBedrooms,
                numberOfBathrooms, monthlyPrice, deposit);
    }
}
