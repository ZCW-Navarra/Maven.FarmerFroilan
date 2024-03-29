package com.zipcodewilmington.froilansfarm.weekdayTests;

import org.junit.Test;
import com.zipcodewilmington.froilansfarm.*;

import static org.junit.Assert.*;

public class FridayTest {
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

        assertEquals(2, froilan,getNumTimesEaten());
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
    @Test
    public void testFroilandaIsEater() {
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Eater);
    }

    @Test
    public void froilandaEatsEarCorn() {
        Pilot froilanda = new Pilot();
        EarCorn ec = new EarcCorn();

        assertTrue(froilanda.eat(ec));
        froilanda.eat(ec);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

    @Test
    public void froilandaEatsTomato() {
        Pilot froilanda = new Pilot();
        Tomato t = new Tomato();

        assertTrue(froilanda.eat(t));
        froilanda.eat(t);

        assertEquals(1, froilanda.getNumTimesEaten(1));
    }

    @Test
    public void froilandaEatsEgg() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();

        assertTrue(froilanda.eat(e));
        froilanda.eat(e);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

    @Test
    public void froilandaEatsFood() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();
        Tomato t = new Tomato();
        EarCorn ec = new EarCorn();

        froilanda.eat(Egg, 2);
        froilanda.eat(Tomato, 1);
        froilanda.eat(EarCorn, 2);

        assertEquals(2, froilanda.getNumTimesEaten(e));
        assertEquals(1, froilanda.getNumTimesEaten(t));
        assertEquals(2, froilanda.getNumTimesEaten(ec));
    }
    @Test
    public void testFroilanIsNoiseMaker() {
        Farmer frolian = new Farmer();
        assertTrue(frolian instanceof NoiseMaker);
    }

    // In addition to all the daily tasks (located in AbstractWeekdayTest.java)
    /**
     By Friday, Froilanda realizes that the third CropRow(Crop plant) is ready for an extra boost of nutrients.
     She applies organic compost to enrich the soil and enhance the quality of the crop
     **/

    //Test
    //- Froilanda is a pilot
    @Test
    public void testFroilandaIsPilot() {
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Pilot);
    }

    //- CropDuster is Aircraft
    @Test
    public void testCropDusterIsAircraft(){
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Aircraft);
    }

    //--> CropDuster is a FarmVehicle
    @Test
    public void testCropDusterIsFarmVehicle(){
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof FarmVehicle);
    }
    //--> CropDuster is a Vehicle
    @Test
    public void testCropDusterIsVehicle(){
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Vehicle);
    }
    //--> CropDuster is Rideable
    @Test
    public void testCropDusterIsRideable(){
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof Rideable);
    }

    /**
     * NoiseMaker
     */
    //
    //-Test CropDuster is a NoiseMaker
    @Test
    public void testCropDusterIsNoiseMaker(){
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof NoiseMaker);
    }

    // Test Froilanda is a NoiseMaker
    @Test
    public void testFroilandaIsNoiseMaker() {
        Pilot frolianda = new Pilot();
        assertTrue(frolianda instanceof NoiseMaker);
    }
    // Test Chicken is a NoiseMaker
    @Test
    public void testChickenIsNoiseMaker() {
        Chicken c = new Chicken();
        assertTrue(c instanceof NoiseMaker);
    }
    // Test Horse is a NoiseMaker
    @Test
    public void testHorseIsNoiseMaker() {
        Horse h = new Horse();
        assertTrue(h instanceof NoiseMaker);
    }

    // Test Animal is a NoiseMaker
    @Test
    public void testAnimalIsNoiseMaker() {
        Animal a = new Animal() {
            @Override
            public String makeNoise() {
                return null;
            }

            @Override
            public <T extends Edible> boolean eat(T edible) {
                return false;
            }
        };
        assertTrue(a instanceof NoiseMaker);
    }
    // Test Aircraft is a NoiseMaker
    @Test
    public void testAircraftIsNoiseMaker() {
        Aircraft a = new Aircraft();
        assertTrue(a instanceof NoiseMaker);
    }

    // Test Tractor is a NoiseMaker
    @Test
    public void testTractorIsNoiseMaker() {
        Tractor t = new Tractor();
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
                return null;
            }
        };
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
                return null;
            }
        };
        assertTrue(v instanceof NoiseMaker);
    }

    //Test froilan and froilanda can ride CropDuster
    @Test
    public void testFroilandaCanMountCropDuster() {
        CropDuster cd = new CropDuster();
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();

        assertTrue(froilanda.mount(cd));
        assertFalse(froilan.mount(cd));

        assertFalse(froilan.dismount(cd));
        assertTrue(froilanda.dismount(cd));

        // Froilan can not fly
        assertFalse(froilan.mount(cd));
        assertFalse(froilan.dismount(cd));
    }
    // - Test CropDuster can fly()
    @Test
    public void testFroilandaCanFlyCropDuster() {
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();

        CropDuster cd = new CropDuster();
        froilanda.mount(cd);
        assertTrue(cd.fly());
        //Farmer can't fly()
        froilanda.dismount(cd);
        assertFalse(cd.fly());
    }
    @Test
    public void testFroilandaCanFertilizedCropRow1(){
        Pilot froilanda = new Pilot();
        CropDuster cd = new CropDuster();
        froilanda.mount(cd);

        CropRow<Crop> cr = new CropRow<>();
        CornStalk cs = new CornStalk();

        cr.add(cs);
        cd.fertilize(cr);
        assertTrue(cr.get(0).isFertilized);

    }





}
