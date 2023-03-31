package com.co.softworld.factory;

import com.co.softworld.abstractFactory.AbstractCareerFactory;
import com.co.softworld.concreteCareer.Database;
import com.co.softworld.concreteCareer.Development;
import com.co.softworld.constants.TypeCareer;
import com.co.softworld.constants.SystemsEngineer;

public class SystemsEngineerFactory implements AbstractCareerFactory<SystemsEngineer> {

    @Override
    public SystemsEngineer getCareer(TypeCareer factory) {
        switch (factory) {
            case DEVELOPMENT:
                return new Development();
            case DATABASE:
                return new Database();
            default:
                return null;
        }
    }
}
