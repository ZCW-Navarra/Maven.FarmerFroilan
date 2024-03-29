package com.zipcodewilmington.froilansfarm;

public class Tractor implements FarmVehicle {
    public <T extends Crop> boolean harvest(CropRow<T> cr) {
        return false;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public <T extends Rideable> boolean setRider() {
        return false;
    }

    @Override
    public <T extends Rideable> T getRider() {
        return null;
    }
}
