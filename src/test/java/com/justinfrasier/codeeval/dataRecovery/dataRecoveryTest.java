package com.justinfrasier.codeeval.dataRecovery;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class dataRecoveryTest {

    private Main uud;

    @Before
    public void setup(){
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2";
        String output = uud.recovery(input);
        assertEquals("However, it was not implemented until 1998 and 2000",output);
    }

    @Test
    public void test2() throws Exception {
        String input = "programming first The language;3 2 1";
        String output = uud.recovery(input);
        assertEquals("The first programming language",output);
    }

    @Test
    public void test3() throws Exception {
        String input = "programs Manchester The written ran Mark 1952 1 in Autocode from;6 2 1 7 5 3 11 4 8 9";
        String output = uud.recovery(input);
        assertEquals("The Manchester Mark 1 ran programs written in Autocode from 1952",output);
    }
}
