package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CornStalkTest {
    @Test
    public void testInstanceof() {
        CornStalk c = new CornStalk();
        
        assertTrue(c instanceof CornStalk);
    }

    @Test
    public void testInheritanceCrop() {
        CornStalk c = new CornStalk();
        
        assertTrue(c instanceof Crop);
    }

    @Test
    public void testInheritanceProduce() {
        CornStalk c = new CornStalk();
        
        assertTrue(c instanceof Produce);
    }

    @Test
    public void testHasBeenHarvested() {
        CornStalk c = new CornStalk();

        assertFalse(c.getHarvestedFlag());

        c.setHarvestedFlag(true);

        assertTrue(c.getHarvestedFlag());
    }
}
