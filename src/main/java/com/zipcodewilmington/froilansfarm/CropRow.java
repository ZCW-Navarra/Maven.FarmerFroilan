package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

<<<<<<< HEAD
public class CropRow <CropType extends Crop> {
    ArrayList<CropType> crops;
=======
public class CropRow<T extends Crop> {
    ArrayList<T> crops = new ArrayList<>();

    public boolean add(T crop) {
        try {
            return crops.add(crop);
        } catch (Exception e) {
            return false;
        }
    }
>>>>>>> 80098928e9ece17cb55071c4be3459b0e74fa1ff
}
