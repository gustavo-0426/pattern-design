package com.co.softworld.concreteFactory;

import com.co.softworld.abstractFactory.AbstractCareerFactory;
import com.co.softworld.constants.TypeFactory;
import com.co.softworld.factory.MedicineFactory;
import com.co.softworld.factory.SystemsEngineerFactory;

public class ProviderFactory {
    public static AbstractCareerFactory provider(TypeFactory typeFactory) {
        switch (typeFactory) {
            case MEDICINE:
                return new MedicineFactory();
            case SYSTEM_ENGINEER:
                return new SystemsEngineerFactory();
            default:
                return null;
        }
    }
}
