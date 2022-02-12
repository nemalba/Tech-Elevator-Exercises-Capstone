package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {

    /*
       GetPartialString("Hello", "There") → "ellohere"
       GetPartialString("java", "code") → "avaode"
       GetPartialString("shotl", "java") → "hotlava"
        */

    @Test //1. GetPartialString("Hello", "There") → "ellohere"
    public void getPartialString_pass_in_Hello_and_There_returns_ellohere() {

        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("Hello", "There");
        String expected = "ellohere";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test // 2.GetPartialString("java", "code") → "avaode"
    public void getPartialString_pass_in_java_and_code_returns_avaode() {

        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("java", "code");
        String expected = "avaode";

        //Assert
        Assert.assertEquals(expected, actual);
    }


    @Test //3.GetPartialString("shotl", "java") → "hotlava"
    public void getPartialString_pass_in_shotl_and_java_returns_hotlava() {

        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String actual = nonStart.getPartialString("shotl", "java");
        String expected = "hotlava";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //4. GetPartialString("", "jav") → "a"
    public void getPartialString_pass_in_empty_And_jav_returns_av(){
        NonStart nonStart = new NonStart();


        String actual = nonStart.getPartialString("", "jav");
        String expected = "av";

        Assert.assertEquals(expected, actual);
    }

    @Test //5. GetPartialString("ja", "") → "a"

    public void getPartialString_pass_in_ja_And_empty_returns_a(){
        NonStart nonStart = new NonStart();


        String actual = nonStart.getPartialString("ja", "");
        String expected = "a";

        Assert.assertEquals(expected, actual);
    }

}