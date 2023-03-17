package com.co.softworld.builder;

import lombok.ToString;

@ToString
public class Student {
    private int id;
    private String name;
    private String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }
}
