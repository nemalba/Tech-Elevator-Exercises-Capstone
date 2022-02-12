package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopsAndArrayExercisesTest {

    @Test
    public void middleWay_pass_in_array_1_2_3_and_4_5_6_return_2_5() {
        LoopsAndArrayExercises loopsAndArrayExercises = new
                LoopsAndArrayExercises();

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] actual = loopsAndArrayExercises.middleWay(a, b);
        int[] expected = {2, 5};


        Assert.assertArrayEquals(expected, actual);
    }
}