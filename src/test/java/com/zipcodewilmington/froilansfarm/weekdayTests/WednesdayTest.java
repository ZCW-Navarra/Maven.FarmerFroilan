package com.zipcodewilmington.froilansfarm.weekdayTests;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class WednesdayTest {
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
        cr.add(new Crop(EarCorn::new) {});

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
    // -- For each of the three crop types that we do
    // -- CornStalk, TomatoPlant, PotatoPlant are the three crop types
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

    //Test chickens are chickens
    @Test
    public void testChickensAreChickens() {
        Chicken c = new Chicken();
        assertTrue(c instanceof Chicken);
    }

    //Test Chickens are Animals
    @Test
    public void testChickensAreAnimals() {
        Chicken c = new Chicken();
        assertTrue(c instanceof Animal);
    }

    //Test Chickens are Produce
    @Test
    public void testChickensAreProduce() {
        Chicken c = new Chicken();
        assertTrue(c instanceof Produce);
    }

    //Test Chickens are Eater
    @Test
    public void testChickensAreEater() {
        Chicken c = new Chicken();
        assertTrue(c instanceof Eater);
    }

    //Test chickens are edible
    @Test
    public void testChickensAreEdible() {
        Chicken c = new Chicken();
        assertTrue(c instanceof Edible);
    }

    //Test a person can eat chickens
    @Test
    public void testFrolianCanEatChicken() {
        Farmer frolian = new Farmer();
        Chicken c = new Chicken();
        c.setFertilizedFlag(true);
        Egg e = c.yield();
        assertTrue(frolian.eat(e));
        assertEquals(1, frolian.getNumTimesEaten());
    }

    // Test chickens can yeild edible eggs
    @Test
    public void testChickensCanYeildEdibleEggs() {
        Chicken c = new Chicken();
        Egg result = c.yield();
        assertTrue(result instanceof Egg);
    }

    // Test chicken eggs can be fertilized
    @Test
    public void testChickenEdibleEggsCanBeFertilized() {
        Chicken c = new Chicken();

        assertTrue(c.getFertilizedFlag());
    }


    // Test constructor or CropDuster
    @Test
    public void testConstructor() {
        CropDuster cropDuster = new CropDuster();
        assertNotNull(cropDuster);
    }


    // Test CropDuster can fertilize CropRow
    @Test
    public void testFertilize() {
        CropDuster cropDuster = new CropDuster();

        CropRow<Crop> cropRowWithCrops = new CropRow<>();
        cropRowWithCrops.add(new TomatoPlant());
        cropRowWithCrops.add(new PotatoPlant());
        cropRowWithCrops.add(new CornStalk());

        assertFalse(cropDuster.fertilize(cropRowWithCrops));

        //Test fertilize empty row
        CropRow<Crop> emptyCropRow = new CropRow<>();

        assertFalse(cropDuster.fertilize(emptyCropRow));
    }

    @Test
    public void testAddCrop() {
        CropRow<Crop> cropRow = new CropRow<>();
        CornStalk cornStalk1 = new CornStalk();
        assertTrue(cropRow.add(cornStalk1));
        assertEquals(1, cropRow.size());
        assertEquals(cornStalk1, cropRow.get(0));
    }

    @Test
    public void testRemoveCrop() {
        CropRow<Crop> cropRow = new CropRow<>();
        CornStalk cornStalk1 = new CornStalk();
        assertFalse(cropRow.remove(cornStalk1)); // Removing from an empty list should return false
        cropRow.add(cornStalk1);
        assertTrue(cropRow.remove(cornStalk1));
        assertEquals(0, cropRow.size());
    }

    @Test
    public void testSize() {
        CropRow<Crop> cropRow = new CropRow<>();
        assertEquals(0, cropRow.size());
        cropRow.add(new CornStalk());
        assertEquals(1, cropRow.size());
    }

    @Test
    public void testIterator() {
        CropRow<Crop> cropRow = new CropRow<>();
        CornStalk cornStalk1 = new CornStalk();
        CornStalk cornStalk2 = new CornStalk();
        cropRow.add(cornStalk1);
        cropRow.add(cornStalk2);

        int count = 0;
        for (Object crop : cropRow) {
            if (count == 0)
                assertEquals(cornStalk1, crop);
            else if (count == 1)
                assertEquals(cornStalk2, crop);
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetCrops() {
        CropRow<Crop> cropRow = new CropRow<>();
        CornStalk cornStalk1 = new CornStalk();
        CornStalk cornStalk2 = new CornStalk();
        cropRow.add(cornStalk1);
        cropRow.add(cornStalk2);

        Crop[] crops = cropRow.getCrops();
        assertEquals(2, crops.length);
        assertEquals(cornStalk1, crops[0]);
        assertEquals(cornStalk2, crops[1]);
    }

}
