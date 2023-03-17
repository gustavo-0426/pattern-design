package com.co.softworld;

import com.co.softworld.abstractFactory.AbstractCareerFactory;
import com.co.softworld.constants.Medicine;
import com.co.softworld.constants.TypeCareer;

import static com.co.softworld.concreteFactory.ProviderFactory.provider;
import static com.co.softworld.constants.TypeCareer.DEVELOPMENT;
import static com.co.softworld.constants.TypeCareer.NUTRITIONIST;
import static com.co.softworld.constants.TypeFactory.MEDICINE;
import static com.co.softworld.constants.TypeFactory.SYSTEM_ENGINEER;

public class App {
    public static void main(String[] args) {
        AbstractCareerFactory careerFactory = provider(MEDICINE);
        Medicine medicine = (Medicine) careerFactory.getCareer(NUTRITIONIST);
        System.out.println(medicine.getSubject());
    }
}
