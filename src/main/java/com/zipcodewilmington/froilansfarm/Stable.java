package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Iterator;

public class Stable implements Iterable<Horse> {
    ArrayList<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<>();
    }

    public boolean add(Horse h) {
        return horses.add(h);
    }

    public boolean remove(Horse h) {
        return horses.remove(h);
    }

    @Override
    public Iterator<Horse> iterator() {
        return horses.iterator();
    }
}
