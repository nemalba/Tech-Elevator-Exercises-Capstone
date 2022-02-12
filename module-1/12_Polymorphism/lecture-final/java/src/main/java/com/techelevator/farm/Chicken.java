package com.techelevator.farm;

import java.math.BigDecimal;

/*
you can extend only 1 class --
you can implement as many interfaces as you want
 */
public class Chicken extends FarmAnimal implements Sellable{

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("8.00");
	}
}