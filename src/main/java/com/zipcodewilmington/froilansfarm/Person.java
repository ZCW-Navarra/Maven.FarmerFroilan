package com.zipcodewilmington.froilansfarm;

public class Person implements Eater, NoiseMaker, Rider {
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
}
