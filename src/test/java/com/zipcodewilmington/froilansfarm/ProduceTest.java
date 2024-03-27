package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProduceTest {
    @Test
    public void testConstructor() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

        // Assert that the object is an instance of Produce (will be true)
        assertTrue(p instanceof Produce);
    }

    @Test
    public void testYieldNull() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

        // Assert that the object's yield is an instance of Edible
//        assertTrue(p.yield() instanceof Edible);
        assertNull(p.yield());
    }

    @Test
    public void testYieldNonNull() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

        // Ensure the fertilized flag is set
        p.setFertilizedFlag(true);

        // Assert that the object's yield is an instance of Edible
//        assertTrue(p.yield() instanceof Edible);
        assertTrue(p.yield() instanceof String);
    }

    @Test
    public void testHasBeenFertilizedDefault() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

        // Assert the object's default fertilization state to be false
        assertFalse(p.getFertilizedFlag());
    }

    @Test
    public void testHasBeenFertilized() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

        // Non-default state
        p.setFertilizedFlag(true);

        // Assert new condition
        assertTrue(p.getFertilizedFlag());
    }

    @Test
    public void testSetFertilized() {
        // Instantiate a *very* generic Produce object
//        Produce<Edible> p = new Produce<>(Edible::new) {};
        Produce<String> p = new Produce<>(String::new) {};

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
