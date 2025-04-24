package com.co.softworld.singleton;

import lombok.Getter;
import lombok.Setter;

public class Singleton {

    @Setter
    @Getter
    private String name;
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }

}
