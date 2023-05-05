package com.co.softworld.concreteDecorator;

import com.co.softworld.component.Component;
import com.co.softworld.decorator.TextDecorator;

public class TextLowerCaseDecorator extends TextDecorator {
    public TextLowerCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public String formatText() {
        return component.formatText().toLowerCase();
    }
}
