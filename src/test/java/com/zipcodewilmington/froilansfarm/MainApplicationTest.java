package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.weekdayTests.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by leon on 2/26/18.
 */
@RunWith(Suite.class)
@SuiteClasses({SundayTest.class, MondayTest.class, TuesdayTest.class, WednesdayTest.class, ThursdayTest.class, FridayTest.class, SaturdayTest.class})
public class MainApplicationTest {
    private static SharedFixture fixture;

    @BeforeClass
    public static void setup() {
        fixture = new SharedFixture();
        fixture.initialize();
    }

    @Before
    public void dailies() {
//        for (Horse h : stableA) {
//            froilan.mount(h);
//            froilan.dismount(h);
//            h.eat(new EarCorn());
//        }
//        for (Horse h : stableB) {
//            froilan.mount(h);
//            froilan.dismount(h);
//            h.eat(new EarCorn());
//        }
//        for (Horse h : stableC) {
//            froilan.mount(h);
//            froilan.dismount(h);
//            h.eat(new EarCorn());
//        }
//
//        froilan.eat(new EarCorn());
//        froilanda.eat(new Tomato());
//
//        for (int i = 0; i < 2; i++) {
//            froilan.eat(new Tomato());
//            froilanda.eat(new EarCorn());
//            froilanda.eat(new EdibleEgg());
//        }
//        for (int i = 0; i < 5; i++) {
//            froilan.eat(new EdibleEgg());
//        }

    }
}
