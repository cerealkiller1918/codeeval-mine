package com.justinfrasier.codeeval.maxRangeSum;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxRangeSum {

    private Main udd;

    @Before
    public void startup(){
        udd = new Main();
    }

    @Test
    public void test1(){
        String input = "5;7 -3 -10 4 2 8 -2 4 -5 -2";
        String output = udd.sum(input);
        assertEquals("16",output);
    }

    @Test
    public void test2(){
        String input = "6;-4 3 -10 5 3 -7 -3 7 -6 3";
        String output = udd.sum(input);
        assertEquals("0",output);
    }

    @Test
    public void test3(){
        String input = "3;-7 0 -45 34 -24 7";
        String output = udd.sum(input);
        assertEquals("17",output);
    }


}
