package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.weekdayTests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by leon on 2/26/18.
 */
@RunWith(Suite.class)
@SuiteClasses({SundayTest.class, MondayTest.class, TuesdayTest.class, WednesdayTest.class, ThursdayTest.class, FridayTest.class, SaturdayTest.class})
public class MainApplicationTest {
}
