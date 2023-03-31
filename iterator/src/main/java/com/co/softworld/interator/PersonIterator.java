package com.co.softworld.interator;

import com.co.softworld.model.Person;

public class PersonIterator implements Iterator {

    private Person[] person;
    private int position;

    public PersonIterator(Person[] person) {
        this.person = person;
        position = 0;
    }

    @Override
    public Person next() {
        return person[position++];
    }

    @Override
    public boolean hasNext() {
        return !(position >= person.length);
    }
}
