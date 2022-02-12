package com.techelevator;

import java.math.BigDecimal;

// abstract class means cannot create a concrete object
public abstract class Dwelling {
    private String address;
    private int squareFootage;
    private int numberOfBedrooms;
    private double numberOfBathrooms;
    private BigDecimal monthlyPrice;
    private BigDecimal deposit;

    public Dwelling(String address, int squareFootage,
                    int numberOfBedrooms, double numberOfBathrooms,
                    BigDecimal monthlyPrice, BigDecimal deposit) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.monthlyPrice = monthlyPrice;
        this.deposit = deposit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }


}
