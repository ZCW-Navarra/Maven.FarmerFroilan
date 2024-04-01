package com.zipcodewilmington.froilansfarm;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void TestPersonIsNoisemaker() {
        Person p = new Person();
        String expected = "a";
        String actual = p.makeNoise();
        assertEquals(expected, actual );
    }

}
