package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class FarmHouse {
    ArrayList<Person> people;

    public FarmHouse() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean contains(Person person) {
        return people.contains(person);
    }
}
