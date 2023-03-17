package com.co.softworld.abstractFactory;

import com.co.softworld.constants.TypeCareer;

public interface AbstractCareerFactory<T> {
    T getCareer(TypeCareer factory);
}
