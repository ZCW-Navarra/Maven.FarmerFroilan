package com.zipcodewilmington.froilansfarm.weekdayTests;

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
        EarCorn e = new Earcorn();

        assertTrue();
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
        Farmer froilanda = new Farmer();

        assertTrue(froilanda instanceof Eater);
    }

    @Test
    public void froilandaEatsEarCorn() {
        Farmer froilanda = new Farmer();
        EarCorn ec = new EarcCorn();

        assertTrue(froilanda.eat(ec));
        froilanda.eat(ec);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

    @Test
    public void froilandaEatsTomato() {
        Famer froilanda = new Farmer();
        Tomato t = new Tomato();

        assertTrue(froilanda.eat(t));
        froilanda.eat(t);

        assertEquals(1, froilanda.getNumTimesEaten(1));
    }

    @Test
    public void froilandaEatsEgg() {
        Famer froilanda = new Farmer();
        Egg e = new Egg();

        assertTrue(froilanda.eat(e));
        froilanda.eat(e);

        assertEquals(2, froilanda.getNumTimesEaten(2));
    }

    @Test
    public void froilandaEatsFood() {
        Famer froilanda = new Farmer();
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

    // Froilan can use the Tractor

    @Test
    public void froilanUseTractor() {
        Farmer froilan = new Farmer();
        Tractor t = new Tractor();

        assertTrue(froiland.mount(t));
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

        assertTrue(t.harvest());
    }
// - test for harvesting Cornstalk
    @Test
    public void testTractorHarvestCornStalk() {
        Tractor t = new Tractor();
        CornStalk cs = new CornStalk();
        CropRow<Cornstalk> cr = new CropRow<>();

        assertTrue(t.harvest(cs));

    }
    // - test for harvesting TomatoPlant
    @Test
    public void testTractorHarvestTomatoPlant() {
        Tractor t = new Tractor();
        TomatoPlant tp = new TomatoPlant();
        CropRow<TomatoPlant> cr = new CropRow<>();

        assertTrue(t.harvest(tp));
    }
    // - test for harvesting PotatoPlant
    @Test
    public void testTractorHarvestPotatoPlant() {
        Tractor t = new Tractor();
        PotatoPlant plant = new PotatoPlant();
        CropRow<PotatoPlant> cr = new CropRow<>();

        assertTrue(t.harvest(plant));
    }
// - Test what happens when the Tractor harvest()s a Crop in a CropRow
    @Test
    public void tractorHarvestCropInCropRow() {
        Tractor t = new Tractor();
        Crop c = new Crop();
        CropRow<Crop> cr = new CropRow<>();
        croprow.addcrop(crop);

        assertTrue(t.harvest(c));
        assertTrue(c.hasBeenHarvested());
    }
}

// - Test what happens when the Tractor harvest()s a Crop in a CropRow
// - Test harvesting each Crop in each CropRow
// -- CornStalk, TomatoPlant, PotatoPlant are the three crops