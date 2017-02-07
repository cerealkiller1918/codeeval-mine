package com.justinfrasier.codeeval.happynumbers;


import com.justinfrasier.codeeval.happnumber.Main;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HappyNumberTest {

    private Main uut;

    @Before
    public void before(){
        uut = new Main();
    }

    @Test
    public void test1(){
        String output = uut.happyNumber("1");
        assertEquals("1", output);
    }

    @Test
    public void test2(){
        String output = uut.happyNumber("7");
        assertEquals("1", output);
    }

    @Test
    public void test3(){
        String output = uut.happyNumber("22");
        assertEquals("0", output);
    }
}
