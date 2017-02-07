package com.justinfrasier.codeeval.timetoeat;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeToEatTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "02:26:31 14:44:45 09:53:27";
        String output = uud.sort(input);
        assertEquals("14:44:45 09:53:27 02:26:31", output);
    }

    @Test
    public void test2() throws Exception {
        String input = "05:33:44 21:25:41";
        String output = uud.sort(input);
        assertEquals("21:25:41 05:33:44", output);
    }
}
