package com.techelevator.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendableItems {

    private String name;
    private BigDecimal price;
    private String type;

    public VendableItems(String name, BigDecimal price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public VendableItems() {
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }


    // Below is reading from the file
    public static String CreateVendableItems() {

        File inputFile = new File("vendingmachine.csv");
        String data = "";
        try (Scanner myReader = new Scanner(inputFile)) {
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}

