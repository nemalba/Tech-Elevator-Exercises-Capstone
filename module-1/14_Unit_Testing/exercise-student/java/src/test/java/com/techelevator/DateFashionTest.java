package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {

    /*
     dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */

    @Test //dateFashion(5, 10) → 2
    public void getATable_pass_in_5_And_10_return_2() {
        // Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual = dateFashion.getATable(5,10);
        int expected = 2;

    //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test //dateFashion(5, 2) → 0
    public void getATable_pass_in_5_And_2_return_0(){

        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual = dateFashion.getATable(5,2);
        int expected = 0;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //dateFashion(5, 5) → 1
    public void getATable_pass_in_5_And_5_return_1(){

        //Arrange
        DateFashion dateFashion = new DateFashion();

        //Act
        int actual = dateFashion.getATable(5,5);
        int expected = 1;

        //Assert
        Assert.assertEquals(expected, actual);

    }


}