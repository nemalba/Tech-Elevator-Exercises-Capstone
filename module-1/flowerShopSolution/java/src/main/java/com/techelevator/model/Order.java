package com.techelevator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

//1
public class Order {

	// 2
	private String bouquetType;
	private int numberOfRoses;
	private BigDecimal subTotal;

	// 3
	public Order(String bouquetType, int numberOfRoses) {
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;

		// calculate and set the subtotal property the moment
		// the object is instantiated:
		setSubTotal();
	}

	 6
	@Override
	public String toString() {
		return "Order [bouquetType=" + this.bouquetType + ", " + "numberOfRoses=" + this.numberOfRoses + ", subtotal="
				+ this.subTotal + "]";
	}




	// 2
	private void setSubTotal() {

		BigDecimal bouquetFee = new BigDecimal(19.99);
		BigDecimal roseFee = BigDecimal.ZERO;

		for (int i = 0; i < this.numberOfRoses; i++) {
			roseFee = roseFee.add(new BigDecimal(2.99));
		}
		this.subTotal = bouquetFee.add(roseFee).setScale(2, RoundingMode.HALF_UP);

	}

	public BigDecimal getSubTotal() {
		return this.subTotal;
	}


}
