package com.co.softworld.builder;

public class StudentBuilder {
    private int id;
    private String name;
    private String address;

    public StudentBuilder id(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(id, name, address);
    }
}
