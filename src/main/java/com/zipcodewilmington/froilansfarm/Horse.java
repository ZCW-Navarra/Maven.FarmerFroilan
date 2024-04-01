package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Horse implements Rideable, Animal {
    Integer numTimesEaten;
    private Rider rider;

    public Horse() {
        this.numTimesEaten = 0;
        this.rider = null;
    }

    @Override
    public <T extends Rider> boolean setRider(T newRider) {
        try {
            Objects.requireNonNull(this.rider);
            if (Objects.isNull(newRider)) {
                this.rider = null;
                return true;
            }
            return false;
        } catch (NullPointerException noRider) {
            if (Objects.isNull(newRider)) {
                return false;
            }
            this.rider = newRider;
            return true;
        }
    }


    @Override
    public <T extends Rider> T getRider() {
        try {
            Objects.requireNonNull(this.rider);
            return (T) this.rider;
        } catch (NullPointerException noRider) {
            return null;
        }
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
