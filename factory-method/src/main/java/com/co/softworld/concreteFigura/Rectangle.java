package com.co.softworld.concreteFigura;

import com.co.softworld.IConstants.IFigure;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements IFigure {

    @Override
    public double calculateArea(double length, double width) {
        double result = length * width;
        log.info("calculateArea from Rectangle, result = " + result);
        return result;
    }
}
