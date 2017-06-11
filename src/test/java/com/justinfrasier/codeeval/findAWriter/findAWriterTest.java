package com.justinfrasier.codeeval.findAWriter;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findAWriterTest {
    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String output = uud.findWriter("osSE5Gu0Vi8WRq93UvkYZCjaOKeNJfTyH6tzDQbxFm4M1ndXIPh27wBA rLclpg| 3 35 27 62 51 27 46 57 26 10 46 63 57 45 15 43 53");
        assertEquals("Stephen King 1947",output);
    }
    @Test
    public void test2() throws Exception {
        String output = uud.findWriter("3Kucdq9bfCEgZGF2nwx8UpzQJyHiOm0hoaYP6ST1WM7Nks5XjrR4IltBeDLV vA| 2 26 33 55 34 50 33 61 44 28 46 32 28 30 3 50 34 61 40 7 1 31");
        assertEquals("Kyotaro Nishimura 1930",output);
    }
}
