package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop> {
    ArrayList<T> crops;

    public CropRow() {
        this.crops = new ArrayList<>();
    }

    public boolean add(T crop) {
        try {
            return crops.add(crop);
        } catch (Exception e) {
            System.err.println("Could not add " + crop + " to CropRow");
            return false;
        }
    }
<<<<<<< HEAD
} >>>>>>> 80098928e9ece17cb55071c4be3459b0e74fa1ff
=======

    public boolean remove(T crop) {
        try {
            return crops.remove(crop);
        } catch (Exception e) {
            System.err.println("Could not remove " + crop + " from CropRow");
            return false;
        }
    }

    public int size() {
        return crops.size();
    }

    public T get(int index) {
        return crops.get(index);
    }
>>>>>>> a98553da7e28fe723fe5ce6f49b6eb96e22b86bd
}
