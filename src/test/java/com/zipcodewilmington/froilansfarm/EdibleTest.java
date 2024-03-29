package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class EdibleTest {

    @Test
    public void tomatoInstanceTest(){
        Tomato tomate = new Tomato();
        Assert.assertTrue(tomate instanceof Edible);
    }

    @Test
    public void earCornInstanceTest(){
        EarCorn earcorn = new EarCorn();
        Assert.assertTrue(earcorn instanceof Edible);
    }

    @Test
    public void eggInstanceTest(){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

}
