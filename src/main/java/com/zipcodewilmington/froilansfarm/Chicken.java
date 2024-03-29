package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce implements Animal {
    Integer numTimesEaten = 0;
    public Chicken() {
        super(Egg::new);
    }
    @Override
    public <T extends Edible> boolean eat(T edible) {
        this.numTimesEaten++;
        return true;
    }

    @Override
    public int getNumTimesEaten() {
        return this.numTimesEaten;
    }

    @Override
    public String makeNoise() {
        return "a";
    }
}
