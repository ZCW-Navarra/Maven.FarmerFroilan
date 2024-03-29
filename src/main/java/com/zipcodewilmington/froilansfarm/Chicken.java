package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce implements Animal {
    public Chicken() {
        super(Egg::new);
    }
    @Override
    public <T extends Edible> boolean eat(T edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "a";
    }
}
