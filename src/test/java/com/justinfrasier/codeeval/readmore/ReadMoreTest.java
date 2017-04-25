package com.justinfrasier.codeeval.readmore;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;

public class ReadMoreTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {uud = new Main();}

    @Test
    public void test1() throws Exception {
        String input = "Tom exhibited.";
        String output = uud.readMore(input);
        assertEquals("Tom exhibited.",output);
    }
    @Test
    public void test2() throws Exception {
        String input = "Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.";
        String output = uud.readMore(input);
        assertEquals("Amy Lawrence was proud and glad, and... <Read More>",output);
    }
    @Test
    public void test3() throws Exception {
        String input = "Tom was tugging at a button-hole and looking sheepish.";
        String output = uud.readMore(input);
        assertEquals("Tom was tugging at a button-hole and looking sheepish.",output);
    }
    @Test
    public void test4() throws Exception {
        String input = "Two thousand verses is a great many - very, very great many.";
        String output = uud.readMore(input);
        assertEquals("Two thousand verses is a great many -... <Read More>",output);
    }
    @Test
    public void test5() throws Exception {
        String input = "Tom's mouth watered for the apple, but he stuck to his work.";
        String output = uud.readMore(input);
        assertEquals("Tom's mouth watered for the apple, but... <Read More>",output);
    }

    @Test
    public void test6() throws Exception {
        String input = "Tom's  mouth watered for  the  apple, but he stuck to his work.";
        String output = uud.readMore(input);
        assertEquals("Tom's mouth watered for the apple, but... <Read More>",output);
    }

}
