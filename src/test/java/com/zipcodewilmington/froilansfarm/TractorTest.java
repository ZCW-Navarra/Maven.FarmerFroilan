package com.zipcodewilmington.froilansfarm;

import static org.junit.Assert.*;
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
        assertTrue(t instanceof FarmVehicle);
    }
    @Test
    public void testInheritanceNoiseMaker(){
        Tractor t = new Tractor();
        assertTrue(t instanceof NoiseMaker);
    }
    @Test
    public void testInheritanceRideable(){
        Tractor t = new Tractor();
        assertTrue(t instanceof Rideable);
    }
    @Test
    public void testNoise(){
        Tractor tractor = new Tractor();
        String expected = "Vroom";
        String actual = tractor.makeNoise();
        assertEquals(expected, actual);
    }
    @Test
    public void testHarvest(){
        Tractor tractor = new Tractor();
        CropRow<TomatoPlant> cropRow = new CropRow<>();

        assertTrue(tractor.harvest(cropRow));
    }
    @Test
    public void testSetRider(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer();
        assertTrue(tractor.setRider(farmer));
    }

    @Test
    public void testGetRider() {
        Tractor tractor = new Tractor();
        assertNull(tractor.getRider());
    }
}
