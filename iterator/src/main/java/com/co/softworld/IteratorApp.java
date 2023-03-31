package com.co.softworld;

import com.co.softworld.interator.Iterator;
import com.co.softworld.list.PersonList;
import com.co.softworld.model.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorApp {

    public static void main(String[] args) {
        Person[] personArray = new Person[2];
        personArray[0] = Person.builder().name("Martin").build();
        personArray[1] = Person.builder().name("Maye").build();

        PersonList personList = new PersonList(personArray);
        Iterator iterator = personList.iterator();
        while (iterator.hasNext())
            log.info(iterator.next().toString());
    }
}
