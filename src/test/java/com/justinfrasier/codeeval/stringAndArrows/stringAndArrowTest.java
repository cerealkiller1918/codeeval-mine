package com.justinfrasier.codeeval.stringAndArrows;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class stringAndArrowTest {
    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();

    }

    @Test
    public void test1() throws Exception{
        String input = "<--<<--<<";
        String output = uud.findArrows(input);
        assertEquals("2", output);
    }

    @Test
    public void test2() throws Exception{
        String input = "<<>>--><--<<--<<>>>--><";
        String output = uud.findArrows(input);
        assertEquals("4", output);
    }

    @Test
    public void test3() throws Exception{
        String input = "<-->>";
        String output = uud.findArrows(input);
        assertEquals("0", output);
    }
}
