package com.zipcodewilmington.froilansfarm;

public interface Rider {
    <T extends Rideable> boolean mount(T rideable);

    <T extends Rideable> boolean dismount(T rideable);
}
