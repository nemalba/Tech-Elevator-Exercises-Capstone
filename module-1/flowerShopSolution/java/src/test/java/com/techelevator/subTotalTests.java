package com.techelevator;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Test;
import com.techelevator.model.Order;

// 7
public class subTotalTests {

	@Test
	public void bouquetNoRoses() {
		
		Order order = new Order("Basic" , 0);
		BigDecimal actualResult = order.getSubTotal().setScale(2, RoundingMode.HALF_UP);
		BigDecimal expectedResult = (new BigDecimal(19.99) ).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void bouquetOneRose() {
		
		Order order = new Order("Basic" , 1);
		BigDecimal actualResult = order.getSubTotal().setScale(2, RoundingMode.HALF_UP);
		BigDecimal expectedResult = (new BigDecimal(22.98) ).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void bouquetTwoRose() {
		
		Order order = new Order("Basic" , 2);
		BigDecimal actualResult = order.getSubTotal().setScale(2, RoundingMode.HALF_UP);
		BigDecimal expectedResult = (new BigDecimal(25.97) ).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult, actualResult);
		
	}

}
