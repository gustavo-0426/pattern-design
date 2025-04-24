package com.co.softworld;

import com.co.softworld.singleton.Singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppSingleton {
    public static void main(String[] args) {

        Singleton singletonUno = Singleton.getInstance();
        singletonUno.setName("Martin");

        Singleton singletonDos = Singleton.getInstance();
        singletonDos.setName("Gustavo");

        log.info("SingletonUno: {}, Name: {}", singletonUno, singletonUno.getName());
        log.info("SingletonDos: {}, Name: {}", singletonDos, singletonDos.getName());

    }
}
