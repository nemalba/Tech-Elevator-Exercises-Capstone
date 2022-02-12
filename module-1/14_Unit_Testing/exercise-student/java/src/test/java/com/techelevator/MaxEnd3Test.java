package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {

    @Test // MakeArray([1, 2, 3]) → [3, 3, 3]
    public void makeArray_pass_in_1_2_3_returns_3_3_3() {

        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] a = {1, 2, 3};
        int[] b = {3, 3, 3};

        int[] actual = maxEnd3.makeArray(a);
        int[] expected = b;

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }


    @Test //MakeArray([11, 5, 9]) → [11, 11, 11]
    public void makeArray_pass_in_11_5_9_returns_11_11_11() {

        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] a = {11, 5, 9};
        int[] b = {11, 11, 11};

        int[] actual = maxEnd3.makeArray(a);
        int[] expected = b;

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test //  MakeArray([2, 11, 3]) → [3, 3, 3]
    public void makeArray_pass_in_2_11_3_returns_3_3_3() {

        //Arrange
        MaxEnd3 maxEnd3 = new MaxEnd3();

        //Act
        int[] a = {2, 11, 3};
        int[] b = {3, 3, 3};

        int[] actual = maxEnd3.makeArray(a);
        int[] expected = b;

        //Assert
        Assert.assertArrayEquals(expected, actual);

    }
}