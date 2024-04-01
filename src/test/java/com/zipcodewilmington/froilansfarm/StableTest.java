package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class StableTest {
    @Test
    public void testAdd() {
        Stable s = new Stable();
        Horse h = new Horse();
        assertTrue(s.add(h));
        assertTrue(s.horses.contains(h));
    }
    @Test
    public void testRemove() {
        Stable s = new Stable();
        Horse h = new Horse();
        s.add(h);
        assertTrue(s.remove(h));
        assertFalse(s.horses.contains(h));
    }

    @Test
    public void testIterator() {
        Stable s = new Stable();
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        s.add(h1);
        s.add(h2);
        int i =0;
        for(Horse horse: s){
            assertNotNull(horse);
            i++;
        }
        assertEquals(2, i);
    }
}
