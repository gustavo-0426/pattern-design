package com.co.softworld.factory;

import com.co.softworld.IConstants.Figure;
import com.co.softworld.IConstants.IFigure;
import com.co.softworld.concreteFigura.Rectangle;
import com.co.softworld.concreteFigura.Triangle;

public class FigureFactory {

    private FigureFactory() {
    }

    public static IFigure builderFigure(Figure figure) throws Exception {
        switch (figure) {
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new Exception("invalid figure");
        }
    }
}
