package com.co.softworld.singleton;

import lombok.Getter;
import lombok.Setter;

public class Singleton {

    @Setter
    @Getter
    private String name;
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
