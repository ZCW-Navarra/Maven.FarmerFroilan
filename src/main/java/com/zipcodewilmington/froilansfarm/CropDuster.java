package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft implements FarmVehicle{
    public CropDuster() {
    }

    public boolean fertilize(CropRow<Crop> cropRow) {
        boolean retVal = true;
        if (cropRow.getCrops().length == 0) {
            retVal = false;
        }
        for (Crop c : cropRow.getCrops()) {
            if (!c.getFertilizedFlag()) {
                retVal = false;
            }
            c.setFertilizedFlag(true);
        }
        return retVal;
    }
}
