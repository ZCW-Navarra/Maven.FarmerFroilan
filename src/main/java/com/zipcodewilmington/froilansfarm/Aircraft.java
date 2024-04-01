package com.zipcodewilmington.froilansfarm;

public class Aircraft implements Vehicle {
    Pilot rider;
    public boolean fly() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Plane engine makes noise!";
    }

    @Override
    public <T extends Rider> boolean setRider(T rider) {
        if (rider instanceof Pilot) {
            this.rider = (Pilot) rider;
            return true;
        }
        return false;
    }

    @Override
    public <T extends Rider> T getRider() {
        return (T) this.rider;
    }
}
