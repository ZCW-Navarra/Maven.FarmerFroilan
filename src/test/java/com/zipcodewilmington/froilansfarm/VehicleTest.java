package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void aircraftInstanceTest(){
        Aircraft airCraft = new Aircraft();
        Assert.assertTrue(airCraft instanceof Vehicle);
    }


    @Test
    public void farmVehicleInstanceTest(){
        FarmVehicle farmVehicle = new FarmVehicle() {
            @Override
            public <T extends Rider> boolean setRider(T rider) {
                return false;
            }

            @Override
            public <T extends Rider> T getRider() {
                return null;
            }

            @Override
            public String makeNoise() {
                return null;
            }
        };
        Assert.assertTrue(farmVehicle instanceof Vehicle);
    }


}
