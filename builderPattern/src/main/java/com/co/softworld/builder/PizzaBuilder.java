package com.co.softworld.builder;

import java.util.List;

public interface PizzaBuilder<T> {
    T mass(String mass);
    T ingredients(List<String> ingredients);
    T instructions(List<String> instructions
    );
}
