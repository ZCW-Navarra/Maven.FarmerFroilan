package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.runners.Suite.SuiteClasses;
//import org.junit.runners.Suite;
//import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//@RunWith(Suite.class)
//@SuiteClasses({SundayTest.class, MondayTest.class, TuesdayTest.class, WednesdayTest.class, ThursdayTest.class, FridayTest.class, SaturdayTest.class})
public class AbstractWeekdayTest {
    static SharedFixture fixture;
    static Stable[] stables;
    static ChickenCoop[] coops;
    static Farmer froilan;
    static Pilot froilanda;
    static Farm froilansFarm;

    @BeforeClass
    public static void setup() {
        fixture = new SharedFixture();
        fixture.initialize();

        stables = fixture.getStables();

        coops = fixture.getCoops();

        froilan = fixture.getFroilan();

        froilanda = fixture.getFroilanda();

        froilansFarm = fixture.getFroilansFarm();
    }

    @Test
    public void froilanInstanceTestFarmer() {
        assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void froilanInheritanceTestPerson() {
        assertTrue(froilan instanceof Person);
    }

    @Test
    public void froilanInheritanceTestBotanist() {
        assertTrue(froilan instanceof Botanist);
    }

    @Test
    public void froilanInheritanceTestRider() {
        assertTrue(froilan instanceof Rider);
    }

    @Test
    public void froilanInheritanceTestEater() {
        assertTrue(froilan instanceof Eater);
    }

    @Test
    public void froilanInheritanceTestNoiseMaker() {
        assertTrue(froilan instanceof NoiseMaker);
    }
}
