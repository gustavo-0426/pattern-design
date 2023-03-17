package com.co.softworld;

import com.co.softworld.abstractFactory.AbstractCareerFactory;
import com.co.softworld.constants.Medicine;
import lombok.extern.slf4j.Slf4j;

import static com.co.softworld.concreteFactory.ProviderFactory.provider;
import static com.co.softworld.constants.TypeCareer.NUTRITIONIST;
import static com.co.softworld.constants.TypeFactory.MEDICINE;
import static java.lang.String.format;

@Slf4j
public class AppAbstractFactory {
    public static void main(String[] args) {
        AbstractCareerFactory careerFactory = provider(MEDICINE);
        Medicine medicine = (Medicine) careerFactory.getCareer(NUTRITIONIST);
        log.info(format("%S", medicine.getSubject()));
    }
}
