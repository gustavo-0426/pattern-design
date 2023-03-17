package com.co.softworld.concreteCareer;

import com.co.softworld.constants.Medicine;
import java.util.List;
import static java.util.List.of;

public class Pediatrics implements Medicine {
    @Override
    public List<String> getSubject() {
        return of("pediatric1", "pediatric2");
    }
}
