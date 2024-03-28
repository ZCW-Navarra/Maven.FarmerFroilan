package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.Botanist;
import org.junit.Test;

import static org.junit.Assert.*;

public class BotanistTest {
    @Test
    public void testInstanceof() {
        Botanist b = new Botanist();

        assertTrue(b instanceof Botanist);
    }

    @Test
    public void testInheritancePerson() {
        Botanist b = new Botanist();

        assertTrue(b instanceof Person);
    }

    @Test
    public void testInheritanceEater() {
        Botanist b = new Botanist();

        assertTrue(b instanceof Eater);
    }

    @Test
    public void testInheritanceNoiseMaker() {
        Botanist b = new Botanist();

        assertTrue(b instanceof NoiseMaker);
    }

    @Test
    public void testPlant() {
        Botanist b = new Botanist();

        assertTrue(b.plant(new Corn(), new CropRow()));
    }
}
