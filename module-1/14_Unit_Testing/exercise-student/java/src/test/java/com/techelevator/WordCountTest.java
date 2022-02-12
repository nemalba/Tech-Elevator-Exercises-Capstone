package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {


    @Test //getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
    public void getCount_pass_in_ba_ba_black_sheep_returns_ba_2_black_1_sheep_1() {
       //Arrange
        WordCount wordCount = new WordCount();

        String[] words = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2 );
        expected.put("black", 1 );
        expected.put("sheep", 1 );

        //Act
        Map<String, Integer> actual = wordCount.getCount(words);

        //Assert
        Assert.assertEquals(expected, actual);



    }




    @Test //getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    public void getCount_pass_in_a_b_a_c_b_returns_a_2_b_2_c_1() {
        //Arrange
        WordCount wordCount = new WordCount();

        String[] words = {"a", "b", "a", "c", "b"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2 );
        expected.put("b", 2 );
        expected.put("c", 1 );

        //Act
        Map<String, Integer> actual = wordCount.getCount(words);

        //Assert
        Assert.assertEquals(expected, actual);
    }
    /*
        @Test //getCount([]) → {}
    public void getCount_pass_in_empty_returns_empty() {

        WordCount wordCount = new WordCount();

    String[] words = {"[]"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("");


        //Act
        Map<String, Integer> actual = wordCount.getCount(words);

        //Assert
        Assert.assertEquals(expected, actual);
    }

 */

    @Test //getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
    public void getCount_pass_in_c_b_a_returns_c_1_b_1_a_1() {

        WordCount wordCount = new WordCount();

        String[] words = {"c", "b", "a"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("c", 1 );
        expected.put("b", 1 );
        expected.put("a", 1 );

        //Act
        Map<String, Integer> actual = wordCount.getCount(words);

        //Assert
        Assert.assertEquals(expected, actual);
    }
}