package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {

     /*
     Given an array of ints, return true if the array is length 1 or more, and the first element and
     the last element are equal.
     IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */


     @Test // IsItTheSame([1, 2, 3]) → false
    public void isItTheSame_pass_in_1_2_3_returns_false() {


         SameFirstLast sameFirstLast = new SameFirstLast();
   int [] a ={1, 2, 3};

        boolean actual = sameFirstLast.isItTheSame(a);
         boolean expected = false;

         Assert.assertEquals(expected,actual);
    }


    @Test // IsItTheSame([1, 2, 3, 1]) → true
    public void isItTheSame_pass_in_1_2_3_1_returns_true() {

         //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        int [] a ={1, 2, 3, 1};
        boolean actual = sameFirstLast.isItTheSame(a);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test //IsItTheSame([1, 2, 1]) → true
    public void isItTheSame_pass_in_1_2_1_returns_true() {

        //Arrange
        SameFirstLast sameFirstLast = new SameFirstLast();

        //Act
        int [] a ={1, 2, 1};
        boolean actual = sameFirstLast.isItTheSame(a);
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected,actual);
    }

}