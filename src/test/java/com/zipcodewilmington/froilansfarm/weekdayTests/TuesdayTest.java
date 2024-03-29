package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;

import static  org.junit.Assert.*;
public class TuesdayTest {

    @Test
    public void testHorseIsAHorse() {
        Horse h = new Horse();

        assertTrue(h instanceof Horse);
    }

    @Test
    public void testHorseIsAnAnimal() {
        Horse h = new Horse();

        assertTrue(h instanceof Animal);
    }

    @Test
    public void testHorseIsARideable() {
        Horse h = new Horse();

        assertTrue(h instanceof Rideable);
    }

    @Test
    public void testFroilanAndFroilandaArePeople() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Person);
        assertTrue(froilan instanceof Person);
    }

    @Test
    public void testFroidAndFroilandaAreRiders() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();

        assertTrue(froilanda instanceof Rider);
        assertTrue(froilan instanceof Rider);
    }

    @Test
    public void testFroilanAndFroilandaCanRide() {
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();
        Horse h = new Horse();

        assertTrue(froilan.mount(h));
        assertFalse(froilanda.mount(h));

        assertFalse(froilanda.dismount(h));
        assertFalse(froilan.dismount(h));

        assertTrue(froilanda.mount(h));
        assertTrue(froilanda.dismount(h));
    }

    @Test
    public void testFroilanMountHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);

        assertEquals(froilan, h.getRider());
    }

    @Test
    public void testFroilanDismountsHorse() {
        Farmer froilan = new Farmer();
        Horse h = new Horse();

        froilan.mount(h);
        froilan.dismount(h);

        assertNull(h.getRider());
    }

    @Test
    public void testEarCornIsEarCorn() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof EarCorn);
    }

    @Test
    public void testEarCornIsEdible() {
        EarCorn e = new EarCorn();

        assertTrue(e instanceof Edible);
    }

    @Test
    public void testHorseIsEater() {
        Horse h = new Horse();

        assertTrue(h instanceof Eater);
    }

    @Test
    public void testHorseEatCorn() {
        Horse h = new Horse();
        EarCorn e = new EarCorn();

        assertTrue(h.eat(e));
        h.eat(e);
        h.eat(e);

        assertEquals(3, h.getNumTimesEaten());
    }

    @Test
    public void testFroilanIsEater() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Eater);
    }

    @Test
    public void testTomatoIsTomato() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Tomato);
    }

    @Test
    public void testTomatoIsEdible() {
        Tomato t = new Tomato();

        assertTrue(t instanceof Edible);
    }

    @Test
    public void testEggIsEgg() {
        Egg e = new Egg();

        assertTrue(e instanceof Egg);
    }

    @Test
    public void testEggIsEdible() {
        Egg e = new Egg();

        assertTrue(e instanceof Edible);
    }

    @Test
    public void testFroilanEatCorn() {
        Farmer froilan = new Farmer();
        EarCorn e = new EarCorn();

        assertTrue(froilan.eat(e));

        assertEquals(1, froilan.getNumTimesEaten());
    }

    @Test
    public void testFroilanEatTomato() {
        Farmer froilan = new Farmer();
        Tomato t = new Tomato();

        assertTrue(froilan.eat(t));
        froilan.eat(t);

        assertEquals(2, froilan, getNumTimesEaten());
    }

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
        EarCorn ec = new EarCorn();

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

        froilanda.eat(e);
        froilanda.eat(e);
        froilanda.eat(t);
        froilanda.eat(ec);
        froilanda.eat(ec);

        assertEquals(2, froilanda.getNumTimesEaten(e));
        assertEquals(1, froilanda.getNumTimesEaten(t));
        assertEquals(2, froilanda.getNumTimesEaten(ec));
    }

    @Test
    public void testFroilanBotanist() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Botanist);
    }

    @Test
    public void testFroilanFarmer() {
        Farmer froilan = new Farmer();

        assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void testCropRowHoldsCrop() {
        CropRow<Crop> cr = new CropRow<>();
        // You can instantiate an abstract class by doing the following:
        // new AbstractClassName() {}
        cr.add(new Crop(EarCorn::new) {});

        assertTrue(cr instanceof CropRow);
        assertTrue(cr.get(0) instanceof Crop);
    }

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

    // Froilan can use the Tractor

    @Test
    public void froilanUseTractor() {
        Farmer froilan = new Farmer();
        Tractor t = new Tractor();

        assertTrue(froilan.mount(t));
        assertTrue(froilan.dismount(t));


    }


    // - Test that Tractor is Rideable

    @Test
    public void testTractorIsARideable() {
        Tractor t = new Tractor();

        assertTrue(t instanceof Rideable);
    }


    // - Test that Tractor is a Vehicle
    @Test
    public void testTractorIsAVehicle() {
        Tractor t = new Tractor();

        assertTrue(t instanceof Vehicle);
    }
    // - Test that Tractor is a FarmVehicle

    @Test
    public void testTractorIsAFarmVehicle() {
        Tractor t = new Tractor();

        assertTrue(t instanceof FarmVehicle);
    }


    // - Test that the Tractor can harvest()

    @Test
    public void testTractorHarvest() {
        Tractor t = new Tractor();

        assertTrue(t.harvest(new CropRow<>()));
    }
// - test for harvesting Cornstalk
    @Test
    public void testTractorHarvestCornStalk() {
        Tractor t = new Tractor();
        CornStalk cs = new CornStalk();
        CropRow<CornStalk> cr = new CropRow<>();

        assertTrue(t.harvest(cr));

    }
    // - test for harvesting TomatoPlant
    @Test
    public void testTractorHarvestTomatoPlant() {
        Tractor t = new Tractor();
        TomatoPlant tp = new TomatoPlant();
        CropRow<TomatoPlant> cr = new CropRow<>();

        assertTrue(t.harvest(cr));
    }
    // - test for harvesting PotatoPlant
    @Test
    public void testTractorHarvestPotatoPlant() {
        Tractor t = new Tractor();
        PotatoPlant plant = new PotatoPlant();
        CropRow<PotatoPlant> cr = new CropRow<>();

        assertTrue(t.harvest(cr));
    }
// - Test what happens when the Tractor harvest()s a Crop in a CropRow
    @Test
    public void tractorHarvestCropInCropRow() {
        Tractor t = new Tractor();
        Crop c = new Crop(EarCorn::new) {};
        CropRow<Crop> cr = new CropRow<>();
        cr.add(c);

        assertTrue(t.harvest(cr));
        assertTrue(c.getHarvestedFlag());
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
                return null;
            }

            @Override
            public <T extends Edible> boolean eat(T edible) {
                return false;
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
            public <T extends Rideable> boolean setRider() {
                return false;
            }

            @Override
            public <T extends Rideable> T getRider() {
                return null;
            }

            @Override
            public String makeNoise() {
                return null;
            }
        };
        assertTrue(fv instanceof NoiseMaker);
    }

    @Test
    public void testVehicleIsNoiseMaker() {
        Vehicle v = new Vehicle() {
            @Override
            public <T extends Rideable> boolean setRider() {
                return false;
            }

            @Override
            public <T extends Rideable> T getRider() {
                return null;
            }

            @Override
            public String makeNoise() {
                return null;
            }
        };
        assertTrue(v instanceof NoiseMaker);
    }

}

// - Test what happens when the Tractor harvest()s a Crop in a CropRow
// - Test harvesting each Crop in each CropRow
// -- CornStalk, TomatoPlant, PotatoPlant are the three crops