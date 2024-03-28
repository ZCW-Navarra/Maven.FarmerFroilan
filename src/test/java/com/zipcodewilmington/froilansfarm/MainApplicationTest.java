package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.weekdayTests.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/26/18.
 */
@RunWith(Suite.class)
@SuiteClasses({Sunday.class, Monday.class, Tuesday.class, Wednesday.class, Thursday.class, Friday.class, Saturday.class})
public class MainApplicationTest {
    @BeforeClass
    public static void setup() {
        Farmer froilan = new Farmer();

        Farm froilansFarm = new Farm();

        Field froilansField = new Field();

        CropRow<CornStalk> cornRow = new CropRow<>();
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        froilansField.addRow(cornRow);
        froilansField.addRow(tomatoRow);
        for (int i = 0; i < 3; i++) {
            froilansField.addRow(new CropRow<Crop>());
        }

        ChickenCoop coopA = new ChickenCoop();
        ChickenCoop coopB = new ChickenCoop();
        ChickenCoop coopC = new ChickenCoop();
        ChickenCoop coopD = new ChickenCoop();
        for (int i = 0; i < 3; i++) {
            coopA.add(new Chicken());
            coopB.add(new Chicken());
            coopC.add(new Chicken());
            coopD.add(new Chicken());
        }
        coopA.add(new Chicken());
        coopB.add(new Chicken());
        coopC.add(new Chicken());


        Stable stableA = new Stable();
        Stable stableB = new Stable();
        Stable stableC = new Stable();
        for (int i = 0; i < 2; i++) {
            stableA.add(new Horse());
            stableB.add(new Horse());
            stableC.add(new Horse());
        }
        stableA.add(new Horse());

        CropDuster duster = new CropDuster();
        Tractor tractor = new Tractor();

        Pilot froilanda = new Pilot();
    }
}
