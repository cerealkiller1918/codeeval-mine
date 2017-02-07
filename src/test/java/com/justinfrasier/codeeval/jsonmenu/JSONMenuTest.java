package com.justinfrasier.codeeval.jsonmenu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JSONMenuTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 27}, {\"id\": 0, \"label\": \"Label 0\"}, null, {\"id\": 93}, {\"id\": 85}, {\"id\": 54}, null, {\"id\": 46, \"label\": \"Label 46\"}]}}\n";
        String output = uud.idSum(input);
        assertEquals("46", output);
    }

    @Test
    public void test2() throws Exception {
        String input = "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 81}]}}";
        String output = uud.idSum(input);
        assertEquals("0", output);
    }
    @Test
    public void test3() throws Exception {
        String input = "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 70, \"label\": \"Label 70\"}, {\"id\": 85, \"label\": \"Label 85\"}, {\"id\": 93, \"label\": \"Label 93\"}, {\"id\": 2}]}}";
        String output = uud.idSum(input);
        assertEquals("248", output);
    }
}
