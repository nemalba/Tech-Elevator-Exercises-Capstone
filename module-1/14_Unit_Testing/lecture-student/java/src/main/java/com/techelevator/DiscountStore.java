package com.techelevator;

import java.util.Map;
import java.util.HashMap;

public class DiscountStore
{
    private final Map<String, Double> discounts = new HashMap<>();

    public DiscountStore()
    {
        discounts.put("KITCHEN4001", 0.20);
        discounts.put("GARAGE1070", 0.15);
        discounts.put("LIVINGROOM", 0.10);
        discounts.put("KITCHEN6073", 0.40);
        discounts.put("BEDROOM3434", 0.60);
        discounts.put("BATH0073", 0.15);
    }

    public double isItOnSale(String itemNumber)
    {
        String key = itemNumber == null ? "" : itemNumber.toUpperCase();
        return discounts.getOrDefault(key, 0.0);
    }
}
