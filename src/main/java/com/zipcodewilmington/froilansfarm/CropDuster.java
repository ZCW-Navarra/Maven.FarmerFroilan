package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft implements FarmVehicle{
    public CropDuster() {
    }

    public boolean fertilize(CropRow<Crop> cropRow) {
        return false;
    }
}
