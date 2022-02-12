package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {

    /*
       frontTimes("Chocolate", 2) →  "ChoCho"
       frontTimes("Chocolate", 3) → "ChoChoCho"
       frontTimes("Abc", 3) → 	 "AbcAbcAbc"
        */

    @Test //frontTimes("Chocolate", 2) →  "ChoCho"
    public void generateString_pass_Chocolate_and_2_returns_ChoCho() {

        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual = frontTimes.generateString("Chocolate", 2);
        String expected = "ChoCho";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test //frontTimes("Chocolate", 3) → "ChoChoCho"
    public void generateString_pass_Chocolate_and_3_returns_ChoChoCho() {

        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual = frontTimes.generateString("Chocolate", 3);
        String expected = "ChoChoCho";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test // frontTimes("Abc", 3) → 	 "AbcAbcAbc"
    public void generateString_pass_Abc_and_3_returns_AbcAbcAbc() {

        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String actual = frontTimes.generateString("Abc", 3);
        String expected = "AbcAbcAbc";

        //Assert
        Assert.assertEquals(expected, actual);

    }



}