package com.co.softworld;

import com.co.softworld.concretePizza.HaywainPizza;
import com.co.softworld.concretePizza.MushroomsPizza;
import lombok.extern.slf4j.Slf4j;

import static java.lang.String.format;
import static java.util.List.of;

@Slf4j
public class AppBuilder {
    public static void main(String[] args) {
        HaywainPizza haywainPizza = HaywainPizza.builder()
                .mass("Mass suave")
                .ingredients(of("oil", "cheese", "ham", "pineapple"))
                .build();

        MushroomsPizza mushroomsPizza = MushroomsPizza.builder()
                .mass("Mass")
                .ingredients(of("oil", "ckicken", "mushroom"))
                .instructions(of("1...", "2...", "3..."))
                .build();
        log.info(format("haywainPizza: %s", haywainPizza));
        log.info(format("mushroomsPizza: %s", mushroomsPizza));

    }
}
