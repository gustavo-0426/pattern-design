package com.co.softworld.concreteCareer;

import com.co.softworld.constants.SystemsEngineer;

import java.util.List;

public class Database implements SystemsEngineer {
    @Override
    public List<String> getSubject() {
        return List.of("database1", "database2");
    }
}
