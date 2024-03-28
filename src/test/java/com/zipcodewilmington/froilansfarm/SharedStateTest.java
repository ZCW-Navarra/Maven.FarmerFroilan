package com.zipcodewilmington.froilansfarm;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SharedStateTest {
    private static SharedFixture sharedFixture;

    @BeforeClass
    public static void setUp() {
        sharedFixture = new SharedFixture();
        sharedFixture.initialize();
    }

    @Test
    public void testInitialized() {
        assertTrue(sharedFixture.isInitialized());
    }
}
