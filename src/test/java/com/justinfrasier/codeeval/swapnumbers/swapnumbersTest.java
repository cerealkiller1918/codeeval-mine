package com.justinfrasier.codeeval.swapnumbers;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class swapnumbersTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();

    }

    @Test
    public void test1() throws Exception{
        String input = "4Always0 5look8 4on9 7the2 4bright8 9side7 3of8 5life5";
        String output = uud.swapNumbers(input);
        assertEquals("0Always4 8look5 9on4 2the7 8bright4 7side9 8of3 5life5", output);
    }

    @Test
    public void test2() throws Exception{
        String input = "5Nobody5 7expects3 5the4 6Spanish4 9inquisition0";
        String output = uud.swapNumbers(input);
        assertEquals("5Nobody5 3expects7 4the5 4Spanish6 0inquisition9", output);
    }
}
