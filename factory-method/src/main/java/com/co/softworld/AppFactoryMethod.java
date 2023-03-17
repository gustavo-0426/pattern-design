package com.co.softworld;

import com.co.softworld.IConstants.IFigure;
import com.co.softworld.factory.FigureFactory;

import static com.co.softworld.IConstants.Figure.RECTANGLE;
import static com.co.softworld.IConstants.Figure.TRIANGLE;

public class AppFactoryMethod {
    public static void main(String[] args) throws Exception {
        IFigure figure = FigureFactory.builderFigure(TRIANGLE);
        figure.calculateArea(3, 2);

        IFigure figure2 = FigureFactory.builderFigure(RECTANGLE);
        figure2.calculateArea(3, 2);
    }
}
