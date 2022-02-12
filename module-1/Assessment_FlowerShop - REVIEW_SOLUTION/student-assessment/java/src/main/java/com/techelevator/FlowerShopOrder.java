package com.techelevator;

import java.math.BigDecimal;

public class FlowerShopOrder {

    private String bouquetType;
    private int numberOfRoses;
    private BigDecimal subtotal;

    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
        // want to calc subtotal or call a method to calc subtotal
        double amount = 19.99 + this.numberOfRoses * 2.99;
        subtotal = new BigDecimal(amount + "");
    }

    public String getBouquetType() {
        return bouquetType;
    }

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }


    public BigDecimal calculateDeliveryTotal(boolean sameDayDelivery, String zipCode){
        BigDecimal deliveryFee = new BigDecimal("0");
        int intZipCode = Integer.parseInt(zipCode);
        if (intZipCode >= 20000 && intZipCode <= 29999){
            deliveryFee = deliveryFee.add(new BigDecimal("3.99"));
            if (sameDayDelivery){
                deliveryFee = deliveryFee.add(new BigDecimal("5.99"));
            }
        } else if (intZipCode >=30000 && intZipCode <= 39999){
            deliveryFee = deliveryFee.add(new BigDecimal("6.99"));
            if (sameDayDelivery){
                deliveryFee = deliveryFee.add(new BigDecimal("5.99"));
            }
        } else if (intZipCode >= 10000 && intZipCode <= 19999){
            // do nothing
        } else {
            deliveryFee = deliveryFee.add(new BigDecimal("19.99"));
        }

        return deliveryFee;
    }

    @Override
    public String toString(){
        return "ORDER - " + this.bouquetType + " - " + this.numberOfRoses + " roses - " + this.subtotal;
    }
}
