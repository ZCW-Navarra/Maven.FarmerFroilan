package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Aircraft implements Vehicle {
    Pilot rider;
    public boolean fly() {
        if (Objects.nonNull(this.rider)) {
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "Make plane engine noise!";
    }

    @Override
    public <T extends Rider> boolean setRider(T newRider) {
        if (newRider instanceof Pilot && Objects.isNull(this.rider)) {
            this.rider = (Pilot) newRider;
            return true;
        } else if (Objects.nonNull(this.rider) && Objects.isNull(newRider)) {
            this.rider = null;
            return true;
        }
        return false;
    }

    @Override
    public <T extends Rider> T getRider() {
        return (T) this.rider;
    }
}
