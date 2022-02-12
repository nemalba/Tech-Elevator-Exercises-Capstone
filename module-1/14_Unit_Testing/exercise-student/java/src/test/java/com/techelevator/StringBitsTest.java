package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {

    /*
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo".
     * GetBits("Hello") → "Hlo"
     * GetBits("Hi") → "H"
     * GetBits("Heeololeo") → "Hello"
     */

    @Test // GetBits("Hello") → "Hlo"
    public void getBits_pass_in_Hello_returns_Hlo() {

     //Arrange
    StringBits stringBits = new StringBits();

    //Act
    String actual = stringBits.getBits("Hello");
    String expected = "Hlo";

    //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //GetBits("Hi") → "H"

    public void getBits_pass_in_Hi_returns_H() {

        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Hi");
        String expected = "H";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test //GetBits("Heeololeo") → "Hello"

    public void getBits_pass_in_Heeololeo_returns_Hello() {

    //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String actual = stringBits.getBits("Heeololeo");
        String expected = "Hello";

        //Assert
        Assert.assertEquals(expected, actual);

    }
}