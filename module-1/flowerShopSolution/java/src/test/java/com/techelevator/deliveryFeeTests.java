package com.techelevator;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;
import com.techelevator.model.Order;

// 7
// Note how the setScale is needed to get us as accurately as possible
// to a 2 digit after the dot decimal representation.

public class deliveryFeeTests {

	@Test
	public void zip20000s_test() {
		
		// Notice how the bounds of the zip code are being tested:
		BigDecimal actualResult1 = Module1CodingAssessment.getDeliveryFee(true, 20000);
		BigDecimal expectedResult1 = (new BigDecimal(9.98)).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expectedResult1, actualResult1);
		
		BigDecimal actualResult2 = Module1CodingAssessment.getDeliveryFee(true, 20034);
		BigDecimal expectedResult2 = (new BigDecimal(9.98)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult2, actualResult2);
		
		BigDecimal actualResult3 = Module1CodingAssessment.getDeliveryFee(true, 29999);
		BigDecimal expecteResult3 = (new BigDecimal(9.98)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult3, actualResult3);	
		
		// Test for when same day delivery was declined
		BigDecimal actualResult4 = Module1CodingAssessment.getDeliveryFee(false, 29999);
		BigDecimal expecteResult4 = (new BigDecimal(3.99)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult4 , actualResult4);	
	}
	
	@Test
	public void zip30000s_test() {
		
		// Notice how the bounds of the zip code are being tested:
		BigDecimal actualResult1 = Module1CodingAssessment.getDeliveryFee(true, 30000);
		BigDecimal expectedResult1 = (new BigDecimal(12.98)).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expectedResult1, actualResult1);
		
		BigDecimal actualResult2 = Module1CodingAssessment.getDeliveryFee(true, 30034);
		BigDecimal expectedResult2 = (new BigDecimal(12.98)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult2, actualResult2);
		
		BigDecimal actualResult3 = Module1CodingAssessment.getDeliveryFee(true, 39999);
		BigDecimal expecteResult3 = (new BigDecimal(12.98)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult3, actualResult3);	
		
		// Test for when same day delivery was declined
		BigDecimal actualResult4 = Module1CodingAssessment.getDeliveryFee(false, 39999);
		BigDecimal expecteResult4 = (new BigDecimal(6.99)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult4 , actualResult4);
	}
	
	@Test
	public void zip10000s_test() {
		
		// Notice how the bounds of the zip code are being tested:
		BigDecimal actualResult1 = Module1CodingAssessment.getDeliveryFee(true, 10000);
		BigDecimal expectedResult1 = (new BigDecimal(0)).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expectedResult1, actualResult1);
		
		BigDecimal actualResult2 = Module1CodingAssessment.getDeliveryFee(true, 10034);
		BigDecimal expectedResult2 = (new BigDecimal(0)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult2, actualResult2);
		
		BigDecimal actualResult3 = Module1CodingAssessment.getDeliveryFee(true, 19999);
		BigDecimal expecteResult3 = (new BigDecimal(0)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult3, actualResult3);	
		
		// Test for when same day delivery was declined
		BigDecimal actualResult4 = Module1CodingAssessment.getDeliveryFee(false, 19999);
		BigDecimal expecteResult4 = (new BigDecimal(0)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expecteResult4 , actualResult4);
	}
			
	@Test
	public void misc_zip() {
		
		BigDecimal actualResult1 = Module1CodingAssessment.getDeliveryFee(true, 49885);
		BigDecimal expectedResult1 = (new BigDecimal(19.99)).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expectedResult1, actualResult1);

	}
}
