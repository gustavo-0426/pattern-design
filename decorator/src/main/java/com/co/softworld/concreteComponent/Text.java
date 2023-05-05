package com.co.softworld.concreteComponent;

import com.co.softworld.component.Component;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Text implements Component {
    private String text;

    @Override
    public String formatText() {
        return text;
    }
}
