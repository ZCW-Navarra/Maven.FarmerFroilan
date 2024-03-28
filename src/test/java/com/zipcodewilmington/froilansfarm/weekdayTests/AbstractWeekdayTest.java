package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.SharedFixture;
import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

//@RunWith(Suite.class)
//@SuiteClasses({SundayTest.class, MondayTest.class, TuesdayTest.class, WednesdayTest.class, ThursdayTest.class, FridayTest.class, SaturdayTest.class})
public class AbstractWeekdayTest {
    static SharedFixture fixture;

    // TODO : Make these testable!!!
    @BeforeClass
    public static void setup() {
        fixture = new SharedFixture();
        fixture.initialize();

        for (Stable s : fixture.getStables()) {
            for (Horse h : s) {
                fixture.getFroilan().mount(h);
                fixture.getFroilan().dismount(h);
                h.eat(new EarCorn());
                h.eat(new EarCorn());
                h.eat(new EarCorn());
            }
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
