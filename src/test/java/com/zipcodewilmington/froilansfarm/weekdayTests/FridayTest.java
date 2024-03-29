package com.zipcodewilmington.froilansfarm.weekdayTests;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class FridayTest extends AbstractWeekdayTest {
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
    public void testFroilanAndFroilandaArePeople() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Person);
        assertTrue(froilan instanceof Person);
    }
    // - test that Froilan and Froilanda are both Riders
    @Test
    public void testFroilanAndFroilandaAreRiders() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilan instanceof Rider);
        assertTrue(froilanda instanceof Rider);
    }

    // - test that Froilan and Froilanda can mount() and dismount() each Horse

    @Test
    public void testFroilanAndFroilandaCanRide() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();
        Horse h = new Horse();

        assertTrue(froilan.mount(h));
        assertFalse(froilanda.mount(h));

        assertFalse(froilanda.dismount(h));
        assertTrue(froilan.dismount(h));

        assertTrue(froilanda.mount(h));
        assertTrue(froilanda.dismount(h));
    }

    // - test that when Froilan mount()s a Horse, that Horse is updated to
    // being ridden by Froilan

    @Test
    public void testFroilanMountsHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);

        assertEquals(froilan, h.getRider());
        //
//        if (Objects.equals(froilan, h.getRider())) {
//            assertTrue(true);
//        } else {
//            fail();
//        }
    }

    // - test that when Froilan dismount()s a Horse, that Horse is updated to
    // being ridden by null

    @Test
    public void testFroilanDismountsHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);

        froilan.dismount(h);

        assertNull(h.getRider());
    }


    // Feeding each Horse 3 EarCorn
    // - test that EarCorn is an EarCorn

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

    // - test that each Horse can eat() 3 EarCorn objects

    @Test
    public void testHorseEatCorn() {
        Horse h = new Horse();
        EarCorn e = new EarCorn();

        assertTrue(h.eat(e));
        h.eat(e);
        h.eat(e);

        assertEquals(3, h.getNumTimesEaten());
    }


    // For breakfast
    // Froilan eats 1 EarCorn, 2 Tomato, and 5 Egg
    // - test that Froilan is an Eater

    @Test
    public void testFroilanIsEater() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Eater);
    }

    // - test that Tomato is a Tomato

    @Test
    public void testTomatoIsTomato() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Tomato);
    }

    // - test that Tomato is an Edible

    @Test
    public void testTomatoIsEdible() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Edible);
    }

    // - test that Egg is an Egg

    @Test
    public void testEggIsEgg() {
        Egg e = new Egg();

        assertTrue(e instanceof Egg);
    }

    // - test that Egg is an Edible

    @Test
    public void testEggIsEdible() {
        Egg e = new Egg();

        assertTrue(e instanceof Edible);
    }

    // - Test that Froilan can eat() 1 EarCorn object

    @Test
    public void testFroilanEatCorn() {
        Farmer froilan = new Farmer();
        EarCorn e = new EarCorn();

        assertTrue(froilan.eat(e));

        assertEquals(1, froilan.getNumTimesEaten());
    }

    // - Test that Froilan can eat() 2 Tomato objects

    @Test
    public void testFroilanEatTomato() {
        Farmer froilan = new Farmer();
        Tomato t = new Tomato();

        assertTrue(froilan.eat(t));
        froilan.eat(t);

        assertEquals(2, froilan,getNumTimesEaten());
    }

    // - Test that Froilan can eat() 5 Egg objects

    @Test
    public void testFroilanEatEggs() {
        Farmer froilan = new Farmer();
        Egg e = new Egg();

        for (int i = 0; i < 5; i++) {
            assertTrue(froilan.eat(e));
        }
        assertEquals(5, froilan.getNumTimesEaten());
    }
    // In addition to all the daily tasks (located in AbstractWeekdayTest.java)
    /**
     By Friday, Froilanda realizes that the third CropRow is ready for an extra boost of nutrients.
     She applies organic compost to enrich the soil and enhance the quality of the crop
     **/

    //Test

}
