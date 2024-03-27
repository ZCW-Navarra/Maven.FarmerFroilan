package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProduceTest {
    @Test
    public void testConstructor() {
        // Instantiate a *very* generic Produce object
        Produce<Edible> p = new Produce<>();

        // Assert that the object is an instance of Produce (will be true)
        assertTrue(p instanceof Produce);
    }

    @Test
    public void testYield() {
        // Instantiate a *very* generic Produce object
        Produce<Edible> p = new Produce<>();

        // Assert that the object's yield is an instance of Edible
        assertTrue(p.yield() instanceof Edible);
    }

    @Test
    public void testHasBeenFertilizedDefault() {
        // Instantiate a *very* generic Produce object
        Produce<Edible> p = new Produce<>();

        // Assert the object's default fertilization state to be false
        assertFalse(p.getFertilizedFlag());
    }

    @Test
    public void testHasBeenFertilized() {
        // Instantiate a *very* generic Produce object
        Produce<Edible> p = new Produce<>();

        // Non-default state
        p.setFertilizedFlag(true);

        // Assert new condition
        assertTrue(p.getFertilizedFlag());
    }

    @Test
    public void testSetFertilized() {
        // Instantiate a *very* generic Produce object
        Produce<Edible> p = new Produce<>();

        // Default condition
        boolean unexpected = p.getFertilizedFlag();

        // Non-default state
        p.setFertilizedFlag(true);

        // Assert new state
        assertNotEquals(unexpected, p.getFertilizedFlag());

        // Assert new condition
        assertTrue(p.getFertilizedFlag());
    }
}
