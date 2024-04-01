package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Person<T extends Rideable> implements Eater, NoiseMaker, Rider<T> {
    Integer numTimesEaten = 0;


    public boolean mount(T rideable) {

        if (Objects.isNull(rideable.getRider())) {
            return rideable.setRider(this);
        }
        return false;
    }


    public boolean dismount(T rideable) {
        if (Objects.nonNull(rideable.getRider()) && rideable.getRider().equals(this)) {
            return rideable.setRider(null);
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
