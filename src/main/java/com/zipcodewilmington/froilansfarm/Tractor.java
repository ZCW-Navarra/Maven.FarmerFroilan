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
    public <T extends Rider> boolean setRider(T rider) {
        return false;
    }

    @Override
    public <T extends Rider> T getRider() {
        return null;
    }
}
