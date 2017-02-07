package com.justinfrasier.codeeval.longestword;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestWordTest {

    private Main uud;
    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "some line with text";
        String output = uud.getLongestWord(input);
        assertEquals("some",output);
    }
    @Test
    public void test2() throws Exception {
        String input = "another line";
        String output = uud.getLongestWord(input);
        assertEquals("another",output);
    }
}
