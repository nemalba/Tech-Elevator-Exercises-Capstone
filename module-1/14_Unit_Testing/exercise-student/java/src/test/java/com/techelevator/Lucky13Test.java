package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {

    /*
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * GetLucky([0, 2, 4]) → true
     * GetLucky([1, 2, 3]) → false
     * GetLucky([1, 2, 4]) → false
     */

    @Test //GetLucky([0, 2, 4]) → true
    public void getLucky_pass_in_0_2_4_return_true() {

        //Arrange
        Lucky13 lucky13 = new Lucky13();

        // Act

        int[] a = {0, 2, 4};
        boolean actual = lucky13.getLucky(a);
        boolean expected = true;

        Assert.assertEquals(expected, actual);

    }

    @Test //GetLucky([1, 2, 3]) → false
    public void getLucky_pass_in_1_2_3_return_false(){

        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        int[] a = {1, 2, 3};
        boolean actual = lucky13.getLucky(a);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //GetLucky([1, 2, 4]) → false
    public void getLucky_pass_in_1_2_4_return_false(){

        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        int[] a = {1, 2, 4 };
        boolean actual = lucky13.getLucky(a);
        boolean expected = false;

        //Assert
        Assert.assertEquals(expected, actual);
    }
}