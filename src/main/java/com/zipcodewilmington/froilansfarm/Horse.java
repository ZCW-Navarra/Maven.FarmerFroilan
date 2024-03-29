package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Horse implements Rideable {
    Rider rider;
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
        return (T) rider;
    }
}
