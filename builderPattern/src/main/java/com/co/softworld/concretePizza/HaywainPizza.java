package com.co.softworld.concretePizza;

import com.co.softworld.builder.HaywainPizzaBuilder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class HaywainPizza {
    private final String mass;
    private final List<String> ingredients;
    private final List<String> instructions;

    public HaywainPizza(String mass, List<String> ingredients, List<String> instructions) {
        this.mass = mass;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public static HaywainPizzaBuilder builder() {
        return new HaywainPizzaBuilder();
    }
}
