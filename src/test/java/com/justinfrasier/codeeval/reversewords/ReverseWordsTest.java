package com.justinfrasier.codeeval.reversewords;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseWordsTest {

    private  Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "Hello World";
        String ouput = uud.reverse(input);
        assertEquals("World Hello", ouput);
    }

    @Test
    public void test2() throws Exception {
        String input = "Hello CodeEval";
        String ouput = uud.reverse(input);
        assertEquals("CodeEval Hello", ouput);
    }
}
