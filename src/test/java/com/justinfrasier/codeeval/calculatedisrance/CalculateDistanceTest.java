package com.justinfrasier.codeeval.calculatedisrance;


import com.justinfrasier.codeeval.calculatedistance.Main;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateDistanceTest {

    private Main uud;

    @Before
    public void setUp() throws Exception {
        uud = new Main();
    }

    @Test
    public void getDistanceTest() throws Exception {
        int output = uud.getDistance(25,4,1,-6);
        assertEquals(26,output);
    }

    @Test
    public void test1() throws Exception {
        String input = "(25, 4) (1, -6)";
        String output = uud.calculate(input);
        assertEquals("26",output);
    }
    @Test
    public void test2() throws Exception {
        String input = "(47, 43) (-25, -11)";
        String output = uud.calculate(input);
        assertEquals("90",output);
    }
}
