package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExercisesTest {

    @Test
    public void makeAbba_pass_in_Hi_and_Bye_returns_HiByeByeHi() {
        //Arrange
        StringExercises stringExercises = new StringExercises();

        //Act
        // when I run the method, what ACTUALLY returns
        String actual = stringExercises.makeAbba("Hi", "Bye");

        //when I run the method, what do I EXPECT to get back
        String expected = "HiByeByeHi";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeAbba_pass_in_Hi_and_Hi_returns_HiHiHiHi(){
        //Arrange
        StringExercises stringExercises = new StringExercises();
        //Act
        Assert.assertEquals("HiHiHiHi", stringExercises.makeAbba("Hi", "Hi"));
    }

    @Test
    public void firstTwo_pass_in_Hello_returns_He(){
        //Arrange
        StringExercises stringExercises = new StringExercises();
        //Act
        String actual = stringExercises.firstTwo("Hello");
        String expected = "He";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstTwo_pass_in_a_returns_a(){
        StringExercises stringExercises = new StringExercises();

        String actual = stringExercises.firstTwo("a");

        Assert.assertEquals("a", actual);
    }
}