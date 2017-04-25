package com.justinfrasier.codeeval.ageDistribution;

        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class AgeDistributionTest {

    private Main uud;

    @Before
    public void setup(){
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "0";
        String output = uud.age(input);
        assertEquals("Still in Mama's arms",output);
    }
    @Test
    public void test2() throws Exception {
        String input = "19";
        String output = uud.age(input);
        assertEquals("College",output);
    }
    @Test
    public void test3() throws Exception {
        String input = "-1";
        String output = uud.age(input);
        assertEquals("This program is for humans",output);
    }
}
