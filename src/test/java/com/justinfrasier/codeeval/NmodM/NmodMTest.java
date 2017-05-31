package com.justinfrasier.codeeval.NmodM;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NmodMTest {

    private Main uud;

    @Before
    public void start(){
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "20,3";
        String output = uud.mod(input);
        String expected = String.valueOf(20%3);
        assertEquals(expected,output);
    }

    @Test
    public void test2() throws Exception {
        String input = "2,3";
        String output = uud.mod(input);
        String expected = String.valueOf(2%3);
        assertEquals(expected,output);
    }

    @Test
    public void test3() throws Exception {
        String input = "20,6";
        String output = uud.mod(input);
        String expected = String.valueOf(20%6);
        assertEquals(expected,output);
    }
}
