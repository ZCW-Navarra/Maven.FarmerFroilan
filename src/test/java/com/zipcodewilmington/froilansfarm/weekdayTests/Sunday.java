package com.zipcodewilmington.froilansfarm.weekdayTests;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sunday extends AbstractWeekdayTest {
    @Test
    public void plantCrops() {
        fixture.getFroilansField().get(0).add(new CornStalk());
        fixture.getFroilansField().get(1).add(new TomatoPlant());
        fixture.getFroilansField().get(2).add(new PotatoPlant());
    }
}
