package com.co.softworld;

import com.co.softworld.singleton.Singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setName("Martin");
        log.info("Name: " + singleton.getName());
    }
}
