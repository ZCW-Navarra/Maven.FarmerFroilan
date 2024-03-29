package com.zipcodewilmington.froilansfarm.weekdayTests;


import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SundayTest {
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
        // the same as this

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


    // - test that Froilanda is an Eater
    @Test
    public void testFroilandaIsEater() {
       Pilot froilanda = new Pilot();

       assertTrue(froilanda instanceof Eater);
    }

    // - test that Froilanda can eat() 2 EarCorn objects

    @Test
    public void froilandaEatsEarCorn() {
        Pilot froilanda = new Pilot();
        EarCorn ec = new EarCorn();

        assertTrue(froilanda.eat(ec));
        froilanda.eat(ec);

        assertEquals(2, froilanda.getNumTimesEaten());
    }

    // - test that Froilanda can eat() 1 Tomato object

    @Test
    public void froilandaEatsTomato() {
        Pilot froilanda = new Pilot();
        Tomato t = new Tomato();

        assertTrue(froilanda.eat(t));
        froilanda.eat(t);

        assertEquals(1, froilanda.getNumTimesEaten());
    }


    // - test that Froilanda can eat() 2 Egg objects

    @Test
    public void froilandaEatsEgg() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();

        assertTrue(froilanda.eat(e));
        froilanda.eat(e);

        assertEquals(2, froilanda.getNumTimesEaten());
    }


    // - test that Froilanda eats 2 EarCorn, 1 Tomato, and 2 Egg
    @Test
    public void froilandaEatsFood() {
        Pilot froilanda = new Pilot();
        Egg e = new Egg();
        Tomato t = new Tomato();
        EarCorn ec = new EarCorn();

        froilanda.eat(e);
        froilanda.eat(e);
        assertEquals(2, froilanda.getNumTimesEaten());

        froilanda.eat(t);
        assertEquals(3, froilanda.getNumTimesEaten());

        froilanda.eat(ec);
        froilanda.eat(ec);

        assertEquals(5, froilanda.getNumTimesEaten());


    }

    // Sunday, Froilan plants 3 different types of Crop in his 1st, 2nd, and 3rd CropRow


    // - test that Froilan is a Botanist

    @Test
    public void testFroilanBotanist() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Botanist);
    }

    // - test that Froilan is a Farmer

    @Test
    public void testFroilanFarmer() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Farmer);
    }

    // - test that CropRow holds Crop

    @Test
    public void testCropRowHoldsCrop() {
        CropRow<Crop> cr = new CropRow<>();
        // You can instantiate an abstract class by doing the following:
        // new AbstractClassName() {}
        cr.add(new Crop(Egg::new) {});

        assertTrue(cr instanceof CropRow);
        assertTrue(cr.get(0) instanceof Crop);
    }

    // - test that:
    // -- Crop type A is a Crop

    @Test
    public void testCornIsCrop() {
        CornStalk cs = new CornStalk();

        assertTrue(cs instanceof Crop);
    }

    @Test
    public void testTomatoIsCrop() {
        TomatoPlant tp = new TomatoPlant();

        assertTrue(tp instanceof Crop);
    }

    @Test
    public void testPotatoIsCrop() {
        PotatoPlant plant = new PotatoPlant();

        assertTrue(plant instanceof Crop);
    }

    // -- Crop type A can be planted in CropRow A

    @Test
    public void testCornInCornRow() {
        CropRow<CornStalk> cornRow = new CropRow<>();
        CornStalk cs = new CornStalk();

        assertTrue(cornRow.add(cs));

        assertEquals(1, cornRow.size());
    }

    @Test
    public void testTomatoInTomatoRow() {
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        TomatoPlant tp = new TomatoPlant();

        assertTrue(tomatoRow.add(tp));

        assertEquals(1, tomatoRow.size());
    }

    @Test
    public void testPotatoInPotatoRow() {
        CropRow<PotatoPlant> potatoRow = new CropRow<>();
        PotatoPlant plant = new PotatoPlant();

        assertTrue(potatoRow.add(plant));

        assertEquals(1, potatoRow.size());
    }

    @Test
    public void testCropInCropRow() {
        CropRow<Crop> cr = new CropRow<>();
        CornStalk cs = new CornStalk();
        TomatoPlant tp = new TomatoPlant();
        PotatoPlant plant = new PotatoPlant();

        assertTrue(cr.add(cs));
        assertTrue(cr.add(tp));
        assertTrue(cr.add(plant));

        assertEquals(3, cr.size());
    }

    // -- Froilan can plant() a Crop type A in CropRow A

    @Test
    public void testPlantCorn() {
        Farmer froilan = new Farmer();
        CornStalk cs = new CornStalk();
        CropRow<CornStalk> cr = new CropRow<>();

        assertTrue(froilan.plant(cs, cr));
    }

    @Test
    public void testPlantTomato() {
        Farmer froilan = new Farmer();
        TomatoPlant tp = new TomatoPlant();
        CropRow<TomatoPlant> cr = new CropRow<>();

        assertTrue(froilan.plant(tp, cr));
    }

    @Test
    public void testPlantPotato() {
        Farmer froilan = new Farmer();
        PotatoPlant plant = new PotatoPlant();
        CropRow<PotatoPlant> cr = new CropRow<>();

        assertTrue(froilan.plant(plant, cr));
    }

    @Test
    public void testFroilanIsNoiseMaker() {
        Farmer frolian = new Farmer();
        assertTrue(frolian instanceof NoiseMaker);
    }

    @Test
    public void testFroilandaIsNoiseMaker() {
        Pilot frolianda = new Pilot();
        assertTrue(frolianda instanceof NoiseMaker);
    }

    @Test
    public void testChickenIsNoiseMaker() {
        Chicken c = new Chicken();
        assertTrue(c instanceof NoiseMaker);
    }

    @Test
    public void testHorseIsNoiseMaker() {
        Horse h = new Horse();
        assertTrue(h instanceof NoiseMaker);
    }

    @Test
    public void testAnimalIsNoiseMaker() {
        Animal a = new Animal() {
            @Override
            public String makeNoise() {
                return "a";
            }

            @Override
            public <T extends Edible> boolean eat(T edible) {
                return true;
            }

            @Override
            public int getNumTimesEaten() {
                return 0;
            }
        };
        assertTrue(a instanceof NoiseMaker);
    }

    @Test
    public void testCropDusterIsNoiseMaker() {
        CropDuster cd = new CropDuster();
        assertTrue(cd instanceof NoiseMaker);
    }

    @Test
    public void testAircraftIsNoiseMaker() {
        Aircraft a = new Aircraft();
        assertTrue(a instanceof NoiseMaker);
    }

    @Test
    public void testTractorIsNoiseMaker() {
        Tractor t = new Tractor();
        assertTrue(t instanceof NoiseMaker);
    }

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
        assertTrue(fv instanceof NoiseMaker);
    }

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

    // -- For each of the three crop types that we do

}
