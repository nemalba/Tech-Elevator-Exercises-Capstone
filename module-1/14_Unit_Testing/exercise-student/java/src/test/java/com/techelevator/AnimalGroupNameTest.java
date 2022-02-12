package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {


            /* GetHerd("giraffe") → "Tower"
            * GetHerd("") -> "unknown"
            * GetHerd("walrus") -> "unknown"
            * GetHerd("Rhino") -> "Crash"
            * GetHerd("rhino") -> "Crash"
            * GetHerd("elephants") -> "unknown"
            *
            */


    @Test //GetHerd("giraffe") → "Tower"
    public void getHerd_pass_in_giraffe_returns_Tower() {
        // Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("giraffe");

        String expected = "Tower";

    //Assert
        Assert.assertEquals(expected, actual);
    }


    @Test  //GetHerd("") -> "unknown"
    public void getHerd_pass_in_empty_returns_unknown() {
      // Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd(" ");

        String expected ="unknown";//"unknown";

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //GetHerd("walrus") -> "unknown"
    public void getHerd_pass_in_walrus_returns_unknown(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        // Act
        String actual = animalGroupName.getHerd("walrus");
        String expected = "unknown";

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test //GetHerd("Rhino") -> "Crash"
    public void getHerd_pass_in_Rhino_returns_Crash(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("Rhino");
        String expected = "Crash";

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test //GetHerd("rhino") -> "Crash"
    public void getHerd_pass_in_rhino_return_Crash(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        // Act
        String actual = animalGroupName.getHerd("rhino");
        String expected = "Crash";

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test //GetHerd("elephants") -> "unknown"
    public void getHerd_pass_in_elephants_return_unknown(){

        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String actual = animalGroupName.getHerd("elephants");
        String expected = "unknown";

        //Assert
        Assert.assertEquals(expected, actual);

    }


}