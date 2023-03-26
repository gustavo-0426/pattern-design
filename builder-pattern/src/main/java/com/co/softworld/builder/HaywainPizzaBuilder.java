package com.co.softworld.builder;

import com.co.softworld.concretePizza.HaywainPizza;

import java.util.List;

public class HaywainPizzaBuilder implements PizzaBuilder<HaywainPizzaBuilder> {
    private String mass;
    private List<String> ingredients;
    private List<String> instructions;

    @Override
    public HaywainPizzaBuilder mass(String mass) {
        this.mass = mass;
        return this;
    }

    @Override
    public HaywainPizzaBuilder ingredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @Override
    public HaywainPizzaBuilder instructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    public HaywainPizza build() {
        return new HaywainPizza(mass, ingredients, instructions);
    }

}
