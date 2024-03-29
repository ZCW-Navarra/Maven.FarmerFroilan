package com.zipcodewilmington.froilansfarm;

public interface Rideable {
    <T extends Rider> boolean setRider(T rider);

    <T extends Rider> T getRider();
}
