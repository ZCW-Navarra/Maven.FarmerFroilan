package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThursdayTest {
    // Riding each Horse in each Stable
    // - test that each Horse is a Horse

    @Test
    public void testHorseIsAHorse() {
        Horse h = new Horse();

        assertTrue(h instanceof Horse);
    }

    // - " an Animal

    @Test
    public void testHorseIsAnAnimal() {
        Horse h = new Horse();

        assertTrue(h instanceof Animal);
    }

    // - " a Rideable

    @Test
    public void testHorseIsARideable() {
        Horse h = new Horse();

        assertTrue(h instanceof Rideable);
    }

    // - test that Froilan and Froilanda are both Persons

    @Test
    public void testFroilanAndFroilandaArePeople() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Person);
        assertTrue(froilan instanceof Person);
    }

    // - test that Froilan and Froilanda are both Riders

    @Test
    public void testFroilanAndFroilandaAreRiders() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilan instanceof Rider);
        assertTrue(froilanda instanceof Rider);
    }

    // - test that Froilan and Froilanda can mount() and dismount() each Horse

    @Test
    public void testFroilanAndFroilandaCanRide() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();
        Horse h = new Horse();

        assertTrue(froilan.mount(h));
        assertFalse(froilanda.mount(h));

        assertFalse(froilanda.dismount(h));
        assertTrue(froilan.dismount(h));

        assertTrue(froilanda.mount(h));
        assertTrue(froilanda.dismount(h));
    }

    // - test that when Froilan mount()s a Horse, that Horse is updated to
    // being ridden by Froilan

    @Test
    public void testFroilanMountsHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);

        assertEquals(froilan, h.getRider());
        //
//        if (Objects.equals(froilan, h.getRider())) {
//            assertTrue(true);
//        } else {
//            fail();
//        }
    }

    // - test that when Froilan dismount()s a Horse, that Horse is updated to
    // being ridden by null

    @Test
    public void testFroilanDismountsHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);

        froilan.dismount(h);

        assertNull(h.getRider());
    }


    // Feeding each Horse 3 EarCorn
    // - test that EarCorn is an EarCorn

    @Test
    public void testEarCornIsEarCorn() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof EarCorn);
    }

    // - " is an Edible

    @Test
    public void testEarCornIsEdible() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof Edible);
    }

    // - test that each Horse is an Eater

    @Test
    public void testHorseIsEater() {
        Horse h = new Horse();

        assertTrue(h instanceof Eater);
    }

    // - test that each Horse can eat() 3 EarCorn objects

    @Test
    public void testHorseEatCorn() {
        Horse h = new Horse();
        EarCorn e = new EarCorn();

        assertTrue(h.eat(e));
        h.eat(e);
        h.eat(e);

        assertEquals(3, h.getNumTimesEaten());
    }


    // For breakfast
    // Froilan eats 1 EarCorn, 2 Tomato, and 5 Egg
    // - test that Froilan is an Eater

    @Test
    public void testFroilanIsEater() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Eater);
    }

    // - Test that Froilan can eat() 1 EarCorn object

    @Test
    public void testFroilanEatCorn() {
        Farmer froilan = new Farmer();
        EarCorn e = new EarCorn();

        assertTrue(froilan.eat(e));

        assertEquals(1, froilan.getNumTimesEaten());
    }

    // - Test that Froilan can eat() 2 Tomato objects

    @Test
    public void testFroilanEatTomato() {
        Farmer froilan = new Farmer();
        Tomato t = new Tomato();

        assertTrue(froilan.eat(t));
        froilan.eat(t);

        assertEquals(2, froilan.getNumTimesEaten());
    }

    // - Test that Froilan can eat() 5 Egg objects

    @Test
    public void testFroilanEatEggs() {
        Farmer froilan = new Farmer();
        Egg e = new Egg();

        for (int i = 0; i < 5; i++) {
            assertTrue(froilan.eat(e));
        }

        assertEquals(5, froilan.getNumTimesEaten());
    }

    // Froilanda eats 2 EarCorn, 1 Tomato, and 2 Egg

    // - test that Froilanda is an Eater
    @Test
    public void testFroilandaIsEater() {
        Farmer froilanda = new Farmer();

        assertTrue(froilanda instanceof Eater);
    }

    // - test that Tomato is a Tomato

    @Test
    public void testTomatoIsTomato() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Tomato);
    }

    // - test that Tomato is an Edible

    @Test
    public void testTomatoIsEdible() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Edible);
    }

    // - test that Egg is an Egg

    @Test
    public void testEggIsEgg() {
        Egg e = new Egg();

        assertTrue(e instanceof Egg);
    }

    // - test that Egg is an Edible

    @Test
    public void testEggIsEdible() {
        Egg e = new Egg();

        assertTrue(e instanceof Edible);
    }

    // - test that Froilanda can eat() 2 EarCorn objects

    @Test
    public void testFroilandaEatCorn() {
        Farmer froilanda = new Farmer();
        EarCorn e = new EarCorn();

        assertTrue(froilanda.eat(e));
        froilanda.eat(e);

        assertEquals(2, froilanda.getNumTimesEaten());
    }

    // - test that Froilanda can eat() 1 Tomato object

    @Test
    public void tesFroilandaEatTomato() {
        Farmer froilanda = new Farmer();
        Tomato t = new Tomato();

        assertTrue(froilanda.eat(t));

        assertEquals(1, froilanda.getNumTimesEaten());
    }

    // - test that Froilanda can eat() 2 Egg objects

    @Test
    public void testFroilandaEatEggs() {
        Farmer froilanda = new Farmer();
        Egg e = new Egg();

        for (int i = 0; i < 2; i++) {
            assertTrue(froilanda.eat(e));
        }

        assertEquals(2, froilanda.getNumTimesEaten());
    }

    //On Thursday, his sister, Froilanda uses the CropDuster to fly over the Field* and fertilize each of the CropRow

    // Test CropDuster is a CropDuster
    @Test
    public void testCropDusterIsACropDuster() {
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof CropDuster);
    }

    // Test CropDuster is Aircraft
    @Test
    public void testCropDusterIsAnAircraft() {
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Aircraft);
    }

    // Test CropDuster is Vehicle
    @Test
    public void testCropDusterIsVehicle() {
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Vehicle);
    }

    // Test CropDuster is Rideable
    @Test
    public void testCropDusterIsRideable() {
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Rideable);
    }

    // Test Persons can mount/dismount CropDuster
    @Test
    public void testFrolandaCanMountCropDuster() {
        CropDuster cd = new CropDuster();
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();

        assertTrue(froilanda.mount(cd));
        assertFalse(froilan.mount(cd));

        assertFalse(froilan.dismount(cd));
        assertTrue(froilanda.dismount(cd));

        //Farmer can not fly
        assertFalse(froilan.mount(cd));
        assertFalse(froilan.dismount(cd));
    }

    // - test that when Froilanda mount()s a CropDuster, that CropDuster is updated to
    // being ridden by Froilanda
    @Test
    public void testFroilandaMountsCropDuster() {
        Pilot froilanda = new Pilot();
        CropDuster cd = new CropDuster();

        froilanda.mount(cd);

        assertEquals(froilanda, cd.getRider());
    }

    // - test that when Froilanda dismount()s a CropDuster, that CropDuster is updated to
    // being ridden by null

    @Test
    public void testFroilandaDismountsCropDuster() {
        Pilot froilanda = new Pilot();
        CropDuster cd = new CropDuster();

        froilanda.mount(cd);

        froilanda.dismount(cd);

        assertNull(cd.getRider());
    }

    // Test CropDuster can fly
    @Test
    public void testFroilandaCanFlyCropDuster() {
        Pilot froilanda = new Pilot();
        CropDuster cd = new CropDuster();
        froilanda.mount(cd);
        assertTrue(cd.fly());        // ???
        froilanda.dismount(cd);
        assertFalse(cd.fly());         // ???
    }

    // Test CropDuster can fertilize CropRows
    @Test
    public void testPilotCanFertilizeCropRowA() {
        Pilot froilanda = new Pilot();
        CropDuster cd = new CropDuster();
        froilanda.mount(cd);

        Field f = new Field();
        CropRow<Crop> cr = new CropRow<>();
        CornStalk cs = new CornStalk();
        TomatoPlant tp = new TomatoPlant();
        PotatoPlant plant = new PotatoPlant();

        cr.add(cs);
        cr.add(tp);
        cr.add(plant);

        f.add(cr);

        for(CropRow row : f){
            cd.fertilize(row);
            for (Crop c : row.getCrops()) {
                assertTrue(c.getFertilizedFlag());
            }
        }

    }

    // Test Froilan is a NoiseMaker
    @Test
    public void testFroilanIsNoiseMaker() {
        Farmer frolian = new Farmer();
        String expected = "a";

        assertTrue(frolian instanceof NoiseMaker);
        assertEquals(expected, frolian.makeNoise());
    }

    // Test Froilanda is a NoiseMaker
    @Test
    public void testFroilandaIsNoiseMaker() {
        Pilot frolianda = new Pilot();
        String expected = "a";

        assertEquals(expected, frolianda.makeNoise());
        assertTrue(frolianda instanceof NoiseMaker);
    }

    // Test Chicken is a NoiseMaker
    @Test
    public void testChickenIsNoiseMaker() {
        Chicken c = new Chicken();
        String expected = "a";

        assertEquals(expected, c.makeNoise());
        assertTrue(c instanceof NoiseMaker);
    }

    // Test Horse is a NoiseMaker
    @Test
    public void testHorseIsNoiseMaker() {
        Horse h = new Horse();
        String expected = "a";

        assertEquals(expected, h.makeNoise());
        assertTrue(h instanceof NoiseMaker);
    }

    // Test Animal is a NoiseMaker
    @Test
    public void testAnimalIsNoiseMaker() {
        Animal a = new Animal() {
            @Override
            public String makeNoise() {
                return "a";
            }

            @Override
            public <T extends Edible> boolean eat(T edible) {
                return false;
            }

            @Override
            public int getNumTimesEaten() {
                return 0;
            }
        };
        String expected = "a";

        assertEquals(expected, a.makeNoise());
        assertTrue(a instanceof NoiseMaker);
    }

    // Test CropDuster is a NoiseMaker
    @Test
    public void testCropDusterIsNoiseMaker() {
        CropDuster cd = new CropDuster();
        String expected = "Make plane engine noise!";

        assertEquals(expected, cd.makeNoise());
        assertTrue(cd instanceof NoiseMaker);
    }

    // Test Aircraft is a NoiseMaker
    @Test
    public void testAircraftIsNoiseMaker() {
        Aircraft a = new Aircraft();
        String expected = "Make plane engine noise!";

        assertEquals(expected, a.makeNoise());
        assertTrue(a instanceof NoiseMaker);
    }

    // Test Tractor is a NoiseMaker
    @Test
    public void testTractorIsNoiseMaker() {
        Tractor t = new Tractor();
        String expected = "Vroom";

        assertEquals(expected, t.makeNoise());
        assertTrue(t instanceof NoiseMaker);
    }

    // Test FarmVehicle is a NoiseMaker
    @Test
    public void testFarmVehicleIsNoiseMaker() {
        FarmVehicle fv = new FarmVehicle() {
            @Override
            public <T extends Rider> boolean setRider(T rider) {
                return false;
            }

            @Override
            public <T extends Rider> T getRider() {
                return null;
            }

            @Override
            public String makeNoise() {
                return "a";
            }
        };
        String expected = "a";

        assertEquals(expected, fv.makeNoise());
        assertTrue(fv instanceof NoiseMaker);
    }

    // Test Vehicle is a NoiseMaker
    @Test
    public void testVehicleIsNoiseMaker() {
        Vehicle v = new Vehicle() {
            @Override
            public <T extends Rider> boolean setRider(T rider) {
                return false;
            }

            @Override
            public <T extends Rider> T getRider() {
                return null;
            }

            @Override
            public String makeNoise() {
                return "a";
            }
        };
        String expected = "a";

        assertEquals(expected, v.makeNoise());
        assertTrue(v instanceof NoiseMaker);
    }
}
