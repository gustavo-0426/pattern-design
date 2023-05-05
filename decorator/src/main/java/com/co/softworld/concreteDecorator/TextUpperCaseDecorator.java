package com.co.softworld.concreteDecorator;

import com.co.softworld.component.Component;
import com.co.softworld.decorator.TextDecorator;

public class TextUpperCaseDecorator extends TextDecorator {

    public TextUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public String formatText() {
        return component.formatText().toUpperCase();
    }
}
