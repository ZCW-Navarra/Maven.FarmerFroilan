package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void horseInstanceTest() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void chickenInstanceTest() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }
}
