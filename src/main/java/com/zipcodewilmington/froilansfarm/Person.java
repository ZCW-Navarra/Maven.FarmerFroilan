package com.zipcodewilmington.froilansfarm;

public class Person implements Eater, NoiseMaker, Rider {
    Integer numTimesEaten = 0;
    public <T extends Rideable> boolean mount(T rideable) {
        if (rideable.getRider().equals(null)) {
            rideable.setRider(this);
            return true;
        }
        return false;
    }

    public <T extends Rideable> boolean dismount(T rideable) {
        if (rideable.getRider().equals(this)) {
            rideable.setRider(null);
            return true;
        }
        return false;
    }

    @Override
    public <T extends Edible> boolean eat(T edible) {
        this.numTimesEaten++;
        return true;
    }

    @Override
    public int getNumTimesEaten() {
        return this.numTimesEaten;
    }

    @Override
    public String makeNoise() {
        return "a";
    }
}
