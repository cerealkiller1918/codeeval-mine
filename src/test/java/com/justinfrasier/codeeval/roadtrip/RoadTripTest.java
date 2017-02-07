package com.justinfrasier.codeeval.roadtrip;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoadTripTest {

    private Main udd;

    @Before
    public void setUp() throws Exception {
        udd = new Main();
    }

    @Test
    public void test1() throws Exception {
        String input = "Rkbs,5453; Wdqiz,1245; Rwds,3890; Ujma,5589; Tbzmo,1303;";
        String output = udd.trip(input);
        assertEquals("1245,58,2587,1563,136",output);

    }
    @Test
    public void test2() throws Exception {
        String input = "Vgdfz,70; Mgknxpi,3958; Nsptghk,2626; Wuzp,2559; Jcdwi,3761;";
        String output = udd.trip(input);
        assertEquals("70,2489,67,1135,197",output);

    }
    @Test
    public void test3() throws Exception {
        String input = "Yvnzjwk,5363; Pkabj,5999; Xznvb,3584; Jfksvx,1240; Inwm,5720;";
        String output = udd.trip(input);
        assertEquals("1240,2344,1779,357,279",output);

    }
    @Test
    public void test4() throws Exception {
        String input = "Ramytdb,2683; Voclqmb,5236;";
        String output = udd.trip(input);
        assertEquals("2683,2553",output);

    }
}
