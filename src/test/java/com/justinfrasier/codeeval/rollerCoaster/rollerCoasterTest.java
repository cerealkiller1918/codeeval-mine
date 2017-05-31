package com.justinfrasier.codeeval.rollerCoaster;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Justin on 05/31/17.
 */
public class rollerCoasterTest {

    private Main uud;

    @Before
    public void start(){
        uud = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "To be, or not to be: that is the question.";
        String output = uud.roller(input);
        assertEquals("To Be, Or NoT tO bE: tHaT iS tHe QuEsTiOn.",output);
    }
}
