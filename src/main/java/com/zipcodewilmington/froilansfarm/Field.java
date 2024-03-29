package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class Field implements Iterable<CropRow>{
    ArrayList<CropRow> rows;

    public Field() {
        this.rows = new ArrayList<>();
    }

    public boolean add(CropRow row) {
        return this.rows.add(row);
    }

    public boolean remove(CropRow row) {
        return this.rows.remove(row);
    }

    @Override
    public Iterator<CropRow> iterator() {
        return rows.iterator();
    }
}
