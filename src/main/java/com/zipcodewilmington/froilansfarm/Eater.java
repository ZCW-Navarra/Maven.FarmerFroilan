package com.zipcodewilmington.froilansfarm;

public interface Eater<T extends Edible> {
    boolean eat(T edible);
}
