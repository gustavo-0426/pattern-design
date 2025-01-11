package com.co.softworld.concreteDecorator;

import com.co.softworld.component.Component;

public class TextLowerCaseDecorator implements Component {

    protected  Component component;

    public TextLowerCaseDecorator(Component component) {
        this. component = component;
    }

    @Override
    public String formatText() {
        return component.formatText().toLowerCase();
    }
}
