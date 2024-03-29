package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;


public class TractorTest {

//    @Test
//    public void testInstanceOf() {
//        Tractor t= new Tractor();
//        Assert.assertTrue(t instanceof Tractor);
//    }
    @Test
    public void testInheritanceFarmVehicle(){
        Tractor t = new Tractor();
        Assert.assertTrue(t instanceof FarmVehicle);
    }
    @Test
    public void testInheritanceNoiseMaker(){
        Tractor t = new Tractor();
        Assert.assertTrue(t instanceof NoiseMaker);
    }
    @Test
    public void testInheritanceRideable(){
        Tractor t = new Tractor();
        Assert.assertTrue(t instanceof Rideable);
    }
    @Test
    public void testNoise(){
        Tractor tractor = new Tractor();
        String expected = "Vroom";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }



}
