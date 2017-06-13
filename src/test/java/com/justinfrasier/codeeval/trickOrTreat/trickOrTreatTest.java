package com.justinfrasier.codeeval.trickOrTreat;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class trickOrTreatTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "Vampires: 1, Zombies: 1, Witches: 1, Houses: 1";
        String output = uud.trickOrTreat(input);
        assertEquals("4", output);
    }

    @Test
    public void test2() throws Exception {
        String input = "Vampires: 3, Zombies: 2, Witches: 1, Houses: 10";
        String output = uud.trickOrTreat(input);
        assertEquals("36", output);
    }


}
