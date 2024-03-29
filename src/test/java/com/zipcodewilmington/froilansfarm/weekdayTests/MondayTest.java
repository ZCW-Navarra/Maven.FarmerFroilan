package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MondayTest {


    /**
     * Ride each horse in each stable
     */
    @Test
    public void testRideHorses() {
        for (Stable s : new Stable[]{ new Stable(), new Stable(), new Stable()}) {
            s.add(new Horse());
            s.add(new Horse());
            s.add(new Horse());
            for (Horse h : s) {
                assertTrue(h instanceof Horse);
            }
        }
    }

    /**
     * Feed each horse
     */
    @Test
    public void testFeedHorses() {
        for (Stable s : stables) {
            for (Horse h : s) {
                int expectedTimesFed = 0;
                assertEquals(h.toString() + " pre-eat failure", expectedTimesFed, h.getNumTimesFed());

                h.eat(new EarCorn());
                h.eat(new EarCorn());
                h.eat(new EarCorn());

                expectedTimesFed = 3;

                assertEquals(h.toString() + " post-eat failure", expectedTimesFed, h.getNumTimesFed());
            }
        }
    }

    @Test
    public void testHorseIsAHorse() {
        Horse h = new Horse();

        assertTrue(h instanceof Horse);
    }

    // - " an Animal

    @Test
    public void testHorseIsAnAnimal() {
        Horse h = new Horse();

        assertTrue(h instanceof Animal);
    }

    // - " a Rideable

    @Test
    public void testHorseIsARideable() {
        Horse h = new Horse();

        assertTrue(h instanceof Rideable);
    }

    // - test that Froilan and Froilanda are both Persons

    @Test
    public void testFroilanAndFroilandaAreRiders() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilan instanceof Rider);
        assertTrue(froilanda instanceof Rider);
    }

    // - test that Froilan and Froilanda can mount() and dismount() each Horse

    @Test
    public void testFroilandaCanRide() {
        Pilot froilanda = new Pilot();
        Horse h = new Horse();

        assertTrue(froilanda.mount(h));
        assertTrue(froilanda.dismount(h));
    }

    @Test
    public void testEarCornIsEarCorn() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof EarCorn);
    }

    // - " is an Edible

    @Test
    public void testEarCornIsEdible() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof Edible);
    }

    // - test that each Horse is an Eater

    @Test
    public void testHorseIsEater() {
        Horse h = new Horse();

        assertTrue(h instanceof Eater);
    }

    @Test
    public void testHorseEatCorn() {
        Horse h = new Horse();
        EarCorn e = new EarCorn();

        assertTrue(h.eat(e));
        h.eat(e);
        h.eat(e);

        assertEquals(3, h.getNumTimesEaten());
    }

    @Test
    public void froilandaEatsFood() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();
        Tomato t = new Tomato();
        EarCorn ec = new EarCorn();

        froilanda.eat(Egg, 2);
        froilanda.eat(Tomato, 1);
        froilanda.eat(EarCorn, 2);

        assertEquals(2, froilanda.getNumTimesEaten(e));
        assertEquals(1, froilanda.getNumTimesEaten(t));
        assertEquals(2, froilanda.getNumTimesEaten(ec));
    }


    @Test
    public void testFroilandaIsEater() {
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Eater);
    }

// - test that Froilanda can eat() 2 EarCorn objects

    @Test
    public void froilandaEatsEarCorn() {
        Pilot froilanda = new Pilot();
        EarCorn ec = new EarCorn();

        assertTrue(froilanda.eat(ec));
        froilanda.eat(ec);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

// - test that Froilanda can eat() 1 Tomato object

    @Test
    public void froilandaEatsTomato() {
        Pilot froilanda = new Pilot();
        Tomato t = new Tomato();

        assertTrue(froilanda.eat(t));
        froilanda.eat(t);

        assertEquals(1, froilanda.getNumTimesEaten(1));
    }


// - test that Froilanda can eat() 2 Egg objects

    @Test
    public void froilandaEatsEgg() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();

        assertTrue(froilanda.eat(e));
        froilanda.eat(e);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

    /**
     * Frolinda is Pilot
     **/
    @Test
    public void testFrolindaIsPilot() {
        Pilot frolinda = new Pilot();
        assertTrue(frolinda instanceof Pilot);
    }

    /**
     * Frolinda is Person
     **/
    @Test
    public void testFloridaIsPerson() {
        Pilot frolinda = new Pilot();
        assertTrue(frolinda instanceof Person);
    }

    /**
     * CropDuster is Vehicle
     **/
    @Test
    public void testCropDusterIsVehicle() {
        CropDuster cropduster = new CropDuster();
        assertTrue(cropduster instanceof Vehicle);
    }

    /**
     * CropDuster is FarmVehicle
     **/
    @Test
    public void testCropDusterIsFarmVehicle() {
        CropDuster cropduster = new CropDuster();
        assertTrue(cropduster instanceof FarmVehicle);
    }

    /**
     * CropDuster is AirCraft
     **/
    @Test
    public void testCropDusterIsAirCraft() {
        CropDuster cropduster = new CropDuster();
        assertTrue(cropduster instanceof Aircraft);
    }

    /**
     * CropDuster is NoiseMaker
     **/
    @Test
    public void testCropDusterIsNoiseMaker() {
        CropDuster cropduster = new CropDuster();
        assertTrue(cropduster instanceof NoiseMaker);
    }

    /**
     * Assert that CropDuster has flown after calling fly()
     */
    @Test
    public void testFlyMethod() {
        Aircraft aircraft = new Aircraft();
//        boolean expected = true;
        boolean actual = aircraft.fly();
        assertTrue(actual);
    }

    /**
     * Assert that CropDuster has fertilized()
     */
    @Test
    public void testFertilizedMethod() {
        CropDuster cropDuster = new CropDuster();
        CropRow<Crop> cropRow = new CropRow<>();

        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        PotatoPlant potatoPlant = new PotatoPlant();
        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);
        cropRow.add(potatoPlant);
        Field f = new Field();
        
//        boolean expected = true;

        for (CropRow cr : f) {
            boolean actual = cropDuster.fertilize(cropRow);
            assertTrue(actual);
        }
    }

    /**
     * Assert that CropDuster has make makenoise()
     */
    @Test
    public void testMakeNoiseMethod() {
        CropDuster cropDuster = new CropDuster();
        String expected = "Make plane engine noise!";
        String actual = cropDuster.makeNoise();
        assertEquals(expected, actual);
    }
}
