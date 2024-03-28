package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.SharedFixture;
import org.junit.BeforeClass;

public class AbstractWeekdayTest {
    static SharedFixture fixture;

    // TODO : Make these testable!!!
    @BeforeClass
    public static void setup() {
        fixture = new SharedFixture();
        fixture.initialize();

        for (Horse h : fixture.getStables()) {
            froilan.mount(h);
            froilan.dismount(h);
            h.eat(new EarCorn());
            h.eat(new EarCorn());
            h.eat(new EarCorn());
        }

        fixture.getFroilan().eat(new EarCorn());
        fixture.getFroilanda().eat(new Tomato());

        for (int i = 0; i < 2; i++) {
            fixture.getFroilan().eat(new Tomato());
            fixture.getFroilanda().eat(new EarCorn());
            fixture.getFroilanda().eat(new EdibleEgg());
        }
        for (int i = 0; i < 5; i++) {
            fixture.getFroilan().eat(new EdibleEgg());
        }
    }
}
