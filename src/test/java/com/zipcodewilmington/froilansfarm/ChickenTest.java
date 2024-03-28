package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void chickenConstructorTest(){
        Chicken chicken = new Chicken();

    }

    @Test
    public void chickenYieldEggTest(){
        Chicken chicken = new Chicken();
        chicken.yield();

        Assert.assertTrue(                  );
    }



    @Test /// NOT RIGHT THIS MUSH HAVE THE EGG CHECKING IF FERTILIZED
    public void chickenHasBeenFertilizedTest(){
        Chicken<Boolean> chicken = new TestChicken<>(); // Concrete implementation of Chicken for testing

        Assert.assertFalse(chicken.hasBeenFertilized()); //Chicken should not be initially fertilized

        chicken.fertilize(true);// fertilize chickenEgg
        Assert.assertTrue(chicken.hasBeenFertilized()); //Chicken should be fertilized now
    }
}
