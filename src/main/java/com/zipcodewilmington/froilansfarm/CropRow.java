package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class CropRow<T extends Crop> implements Iterable {
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

    @Override
    public Iterator<T> iterator() {
        return crops.iterator();
    }

    public Crop[] getCrops() {
        return crops.toArray(new Crop[0]);
    }


}
