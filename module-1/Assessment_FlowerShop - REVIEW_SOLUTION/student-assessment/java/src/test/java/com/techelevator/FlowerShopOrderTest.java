package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FlowerShopOrderTest extends TestCase {

    @Test
    public void testCalculateDeliveryTotal_sameDay_true_and_zip_21000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(true, "21000");
        BigDecimal expect = new BigDecimal("9.98");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCalculateDeliveryTotal_sameDay_false_and_zip_21000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(false, "21000");
        BigDecimal expect = new BigDecimal("3.99");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCalculateDeliveryTotal_sameDay_true_and_zip_31000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(true, "31000");
        BigDecimal expect = new BigDecimal("12.98");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCalculateDeliveryTotal_sameDay_false_and_zip_31000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(false, "31000");
        BigDecimal expect = new BigDecimal("6.99");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCalculateDeliveryTotal_sameDay_true_and_zip_11000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(true, "11000");
        BigDecimal expect = new BigDecimal("0");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testCalculateDeliveryTotal_sameDay_false_and_zip_11000() {
        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        BigDecimal actual = order.calculateDeliveryTotal(false, "11000");
        BigDecimal expect = new BigDecimal("0");

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void testToString_with_standard_and_10_returns_4989() {

        FlowerShopOrder order = new FlowerShopOrder("standard", 10);

        String expected = "ORDER - standard - 10 roses - 49.89";
        String actual = order.toString();

        Assert.assertEquals(expected, actual);
    }

}