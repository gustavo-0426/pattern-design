package com.co.softworld.concreteFigura;

import com.co.softworld.IConstants.IFigure;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements IFigure {

    @Override
    public double calculateArea(double base, double height) {
        double result = base * height / 2;
        log.info("calculateArea from Rectangle, result = " + result);
        return result;
    }
}
