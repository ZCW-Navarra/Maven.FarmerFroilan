package com.zipcodewilmington.froilansfarm;

public class Botanist extends Person {
    public Botanist() {

    }

    public <T extends Crop> boolean plant(T cropToPlant, CropRow rowToPlantIn) {
        return rowToPlantIn.add(cropToPlant);
    }
}
