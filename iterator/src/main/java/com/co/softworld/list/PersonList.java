package com.co.softworld.list;

import com.co.softworld.interator.Iterator;
import com.co.softworld.interator.PersonIterator;
import com.co.softworld.list.ListCustom;
import com.co.softworld.model.Person;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonList implements ListCustom {

    private Person[] person;

    @Override
    public Iterator iterator() {
        return new PersonIterator(person);
    }
}
