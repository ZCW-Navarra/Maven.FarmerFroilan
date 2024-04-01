package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> coops;
    FarmHouse house;

    public Farm() {
        stables = new ArrayList<>();
        coops = new ArrayList<>();
        house = new FarmHouse();
    }

    public Stable[] getStables() {
        return stables.toArray(new Stable[0]);
    }

    public ChickenCoop[] getCoops() {
        return coops.toArray(new ChickenCoop[0]);
    }

    public FarmHouse getHouse() {
        return house;
    }
}
