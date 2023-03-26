package com.co.softworld.builder;

import com.co.softworld.concretePizza.MushroomsPizza;

import java.util.List;

public class MushroomsPizzaBuilder implements PizzaBuilder<MushroomsPizzaBuilder> {
    private String mass;
    private List<String> ingredients;
    private List<String> instructions;

    @Override
    public MushroomsPizzaBuilder mass(String mass) {
        this.mass = mass;
        return this;
    }

    @Override
    public MushroomsPizzaBuilder ingredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @Override
    public MushroomsPizzaBuilder instructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    public MushroomsPizza build() {
        return new MushroomsPizza(mass, ingredients, instructions);
    }
}
