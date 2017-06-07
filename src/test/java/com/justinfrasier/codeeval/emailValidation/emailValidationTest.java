package com.justinfrasier.codeeval.emailValidation;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class emailValidationTest {
    private Main udd;

    @Before
    public void setUp() throws Exception {
        udd = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "foo@bar.com";
        String output = udd.emailChecker(input);
        assertEquals("true",output);

    }

    @Test
    public void test2() throws Exception {
        String input = "this is not an email id";
        String output = udd.emailChecker(input);
        assertEquals("false",output);

    }

    @Test
    public void test3() throws Exception {
        String input = "admin#codeeval.com";
        String output = udd.emailChecker(input);
        assertEquals("false",output);

    }


    @Test
    public void test4() throws Exception {
        String input = "good123@bad.com";
        String output = udd.emailChecker(input);
        assertEquals("true",output);

    }

    @Test
    public void test5() throws Exception {
        String input = "good123.bad@com";
        String output = udd.emailChecker(input);
        assertEquals("false",output);

    }

}
