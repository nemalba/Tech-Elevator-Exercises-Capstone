package com.techelevator.farm;

import java.math.BigDecimal;

public interface Sellable {
    // what does it mean to be sellable?
    BigDecimal getPrice();  // any class that implements this
    // interface must provide what it means to get the price?
}
