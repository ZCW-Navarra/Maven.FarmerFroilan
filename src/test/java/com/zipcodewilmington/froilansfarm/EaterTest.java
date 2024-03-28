package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void extendsEdibleTest(){
        Assert.assertTrue(Eater instanceof Edible);
    }

    @Test
    public void doesntExtendVehicle(){
        Assert.assertFalse(Eater instanceof Vehicle);
    }

    @Test
    public void eatTest(){
        Eater eater = new TestEater();
        eater.eat();
    }


}
