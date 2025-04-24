package com.co.softworld.concreteCreator;

import com.co.softworld.IConstants.IFigure;
import com.co.softworld.concreteFigura.Rectangle;
import com.co.softworld.creator.FigureCreator;

public class TriangleConcretCreator extends FigureCreator {

    @Override
    public IFigure createFigure() {
        return new Rectangle();
    }
}
