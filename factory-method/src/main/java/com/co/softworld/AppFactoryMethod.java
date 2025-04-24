package com.co.softworld;

import com.co.softworld.IConstants.IFigure;
import com.co.softworld.concreteCreator.RectangleConcretCreator;
import com.co.softworld.concreteCreator.TriangleConcretCreator;


public class AppFactoryMethod {

    public static void main(String[] args) throws Exception {

        TriangleConcretCreator triangleConcretCreator = new TriangleConcretCreator();
        IFigure triangle = triangleConcretCreator.createFigure();
        triangle.calculateArea(3, 2);

        RectangleConcretCreator rectangleConcretCreator = new RectangleConcretCreator();
        IFigure rectangle = rectangleConcretCreator.createFigure();
        rectangle.calculateArea(4, 3);
    }
}
