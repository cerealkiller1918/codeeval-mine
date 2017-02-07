package com.justinfrasier.codeeval.romannumerals;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    private  Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();

    }

    @Test
    public void test1() throws Exception{
        String input = "159";
        String output = uud.roman(input);
        assertEquals("CLIX", output);
    }

    @Test
    public void test2() throws Exception {
        String input = "296";
        String output = uud.roman(input);
        assertEquals("CCXCVI", output);
    }

    @Test
    public void test3() throws Exception {
        String input = "3992";
        String output = uud.roman(input);
        assertEquals("MMMCMXCII", output);
    }
    @Test
    public void test4() throws Exception {
        String input = "3492";
        String output = uud.roman(input);
        assertEquals("MMMCDXCII", output);
    }

}
