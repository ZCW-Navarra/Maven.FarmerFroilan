package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<>();
    }

    public boolean add(Chicken chicken) {
        return chickens.add(chicken);
    }

    public boolean remove(Chicken chicken) {
        return chickens.remove(chicken);
    }

    public boolean contains(Chicken chicken) {
        return chickens.contains(chicken);
    }
}
