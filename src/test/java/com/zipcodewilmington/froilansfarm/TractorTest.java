package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;


public class TractorTest {
    @Test
    public void testOperate() {
        Tractor tractor = new Tractor();
//        Farmer farmer = new Farmer();
//        Field field = new Field();
        Farm farm = new Farm();
        Assert.assertTrue(tractor.operate(farm));
    }
    @Test
    public void testNoise(){
        Tractor tractor = new Tractor();
        String expected = "Vroom";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }

}
