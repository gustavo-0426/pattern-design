package com.co.softworld;

import com.co.softworld.builder.Student;
import lombok.extern.slf4j.Slf4j;

import static java.lang.String.format;

@Slf4j
public class AppBuilder {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .name("Gustavo")
                .build();
        log.info(format("%S", student));
    }
}
