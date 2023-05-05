package com.co.softworld.decorator;

import com.co.softworld.component.Component;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class TextDecorator implements Component {
    protected Component component;
}
