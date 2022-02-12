package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Less20Test {

    /*

         less20(18) → true
         less20(19) → true
         less20(20) → false
     */
    @Test // less20(18) → true
    public void isLessThanMultipleOf20_pass_in_18_returns_true() {

        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(18);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test // less20(19) → true
    public void isLessThanMultipleOf20_pass_in_19_returns_true() {

        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(19);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //less20(20) → false
    public void isLessThanMultipleOf20_pass_in_20_returns_false() {

        //Arrange
        Less20 less20 = new Less20();

        //Act
        boolean actual = less20.isLessThanMultipleOf20(20);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);
    }
}