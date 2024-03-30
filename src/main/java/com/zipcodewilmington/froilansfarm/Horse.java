package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Horse implements Rideable, Animal {
    Integer numTimesEaten = 0;
    private Rider rider;
    @Override
    public <T extends Rider> boolean setRider(T rider) {
        try {
            Objects.requireNonNull(rider);
            return false;
        } catch (NullPointerException noRider) {
            this.rider = rider;
            return true;
        }
    }

    @Override
    public <T extends Rider> T getRider() {
        return (T) this.rider;
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
