package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void testCrop(){
        Crop<Boolean> crop = new TestCrop<>(); // Concrete implementation of Crop for testing

        Assert.assertFalse(crop.hasBeenFertilized()); //Crop should not be initially fertilized

        crop.fertilize(true);// fertilize crop
        Assert.assertTrue(crop.hasBeenFertilized()); //Crop should be fertilized now
    }



}
