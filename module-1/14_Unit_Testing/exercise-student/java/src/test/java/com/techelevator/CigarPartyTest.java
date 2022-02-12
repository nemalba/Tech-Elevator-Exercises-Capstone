package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {

   /*
        haveParty(30, false) → false
        haveParty(50, false) → true
        haveParty(70, true) → true
        */

    @Test // haveParty(30, false) → false
    public void haveParty_pass_in_30_And_false_returns_false() {

         // Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual = cigarParty.haveParty(30, false);
        boolean expected = false;

    }

    @Test //haveParty(50, false) → true
    public void haveParty_pass_in_50_And_false_return_true(){

        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual = cigarParty.haveParty(50, false);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //haveParty(70, true) → true
    public void haveParty_pass_in_70_And_true_returns_true(){

        //Arrange
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean actual = cigarParty.haveParty(70, true);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected, actual);
    }


}