package com.zipcodewilmington.froilansfarm;

public interface Rider<T extends Rideable> {
    boolean mount(T rideable);

    boolean dismount(T rideable);
}
