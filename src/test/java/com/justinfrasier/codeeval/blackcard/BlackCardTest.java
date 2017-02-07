package com.justinfrasier.codeeval.blackcard;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackCardTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "John Sara Tom Susan | 3";
        String output = uud.blackCard(input);
        assertEquals("Sara",output);
    }

    @Test
    public void test2() throws Exception {
        String input = "John Tom Mary | 5";
        String output = uud.blackCard(input);
        assertEquals("Mary", output);
    }

    @Test
    public void test3() throws Exception {
        String input = "Xra Xiciz Nsik Oywi | 14";
        String output = uud.blackCard(input);
        assertEquals("Xra", output);
    }

}
