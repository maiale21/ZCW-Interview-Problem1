package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

    private Problem1 problem1;
    private String stringToTest;

    @Before
    public void setUp(){
        problem1 = new Problem1();
        stringToTest = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
    }

    @Test
    public void replaceCharactersTest(){
        String expected = "The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer";
        String actual = problem1.replaceCharacters(stringToTest);
        Assert.assertEquals(expected, actual);

    }
}
