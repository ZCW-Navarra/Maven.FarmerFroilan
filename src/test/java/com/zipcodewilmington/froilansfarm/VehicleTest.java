package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void aircraftInstanceTest(){
        AirCraft airCraft = new AirCraft();
        Assert.assertTrue(airCraft instanceof Vehicle);
    }


    @Test
    public void aircraftInstanceTest(){
        FarmVehicle farmVehicle = new FarmVehicle();
        Assert.assertTrue(farmVehicle instanceof Vehicle);
    }


}
