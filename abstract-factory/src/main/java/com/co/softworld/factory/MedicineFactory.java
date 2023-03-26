package com.co.softworld.factory;

import com.co.softworld.abstractFactory.AbstractCareerFactory;
import com.co.softworld.concreteCareer.Dermatology;
import com.co.softworld.concreteCareer.Nutritionist;
import com.co.softworld.concreteCareer.Pediatrics;
import com.co.softworld.constants.TypeCareer;
import com.co.softworld.constants.Medicine;

public class MedicineFactory implements AbstractCareerFactory<Medicine> {
    @Override
    public Medicine getCareer(TypeCareer typeCareer) {
        switch (typeCareer) {
            case DERMATOLOGY:
                return new Dermatology();
            case PEDIATRIC:
                return new Pediatrics();
            case NUTRITIONIST:
                return new Nutritionist();
            default:
                return null;
        }
    }
}
