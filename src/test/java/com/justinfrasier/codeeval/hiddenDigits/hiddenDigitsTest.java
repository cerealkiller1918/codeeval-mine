package com.justinfrasier.codeeval.hiddenDigits;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class hiddenDigitsTest {

    private Main uut;

    @Before
    public void before(){
        uut = new Main();
    }

    @Test
    public void test1(){
        String output = uut.hidden("abcdefghik");
        assertEquals("012345678", output);
    }

    @Test
    public void test2(){
        String output = uut.hidden("Xa,}A#5N}{xOBwYBHIlH,#W");
        assertEquals("05", output);
    }

    @Test
    public void test3(){
        String output = uut.hidden("(ABW>'yy^'M{X-K}q,");
        assertEquals("NONE", output);
    }

    @Test
    public void test4(){
        String output = uut.hidden("6240488");
        assertEquals("6240488", output);
    }
}
