package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop> {
    ArrayList<T> crops = new ArrayList<>();

    public boolean add(T crop) {
        try {
            return crops.add(crop);
        } catch (Exception e) {
            return false;
        }
    }
}
