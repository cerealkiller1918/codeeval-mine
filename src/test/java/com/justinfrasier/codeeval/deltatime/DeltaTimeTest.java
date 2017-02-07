package com.justinfrasier.codeeval.deltatime;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeltaTimeTest {

    public Main uut;

    @Before
    public void before(){
        uut = new Main();
    }


    @Test
    public void test1(){
        String input = "14:01:57 12:47:11";

        String output = uut.getDeltaTime(input);
        assertEquals("01:14:46", output);
    }

    @Test
    public void test2(){
        String input = "13:09:42 22:16:15";
        String output = uut.getDeltaTime(input);
        assertEquals("09:06:33", output);
    }

    @Test
    public void test3(){
        String input = "08:08:06 08:38:28";

        String output = uut.getDeltaTime(input);
        assertEquals("00:30:22", output);
    }

    @Test
    public void test4(){
        String input = "23:35:07 02:49:59";

        String output = uut.getDeltaTime(input);
        assertEquals("20:45:08", output);
    }

    @Test
    public void test5(){
        String input = "14:31:45 14:46:56";
        String output = uut.getDeltaTime(input);
        assertEquals("00:15:11", output);
    }

    @Test
    public void test6(){
        String input = "14:46:56 14:31:45";
        String output = uut.getDeltaTime(input);
        assertEquals("00:15:11", output);
    }

    @Test
    public void test7() throws Exception {
        assertEquals("00:30:22", uut.getDeltaTime("08:38:28 08:08:06"));
    }

    @Test
    public void test8() throws Exception {
        assertEquals("00:30:22", uut.Delta("08:38:28 08:08:06"));
    }
}
