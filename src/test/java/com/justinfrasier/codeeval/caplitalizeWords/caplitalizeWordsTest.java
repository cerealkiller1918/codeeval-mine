package com.justinfrasier.codeeval.caplitalizeWords;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class caplitalizeWordsTest{

        private Main uud;

        @Before
        public void setUp() throws Exception {
            uud = new Main();
        }

        @Test
        public void test1() throws Exception {
            String output = uud.caplitalize("Hello world");
            assertEquals("Hello World",output);
        }

        @Test
        public void test2() throws Exception {
            String output = uud.caplitalize("javaScript language");
            assertEquals("JavaScript Language",output);
        }

        @Test
        public void test3() throws Exception {
            String output = uud.caplitalize("a letter");
            assertEquals("A Letter",output);
        }

        @Test
        public void test4() throws Exception {
            String output = uud.caplitalize("1st thing");
            assertEquals("1st Thing",output);
        }


}
