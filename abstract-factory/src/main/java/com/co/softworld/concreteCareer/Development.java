package com.co.softworld.concreteCareer;

import com.co.softworld.constants.SystemsEngineer;
import java.util.List;

public class Development implements SystemsEngineer {
    @Override
    public List<String> getSubject() {
        return List.of("development1", "development2");
    }
}
