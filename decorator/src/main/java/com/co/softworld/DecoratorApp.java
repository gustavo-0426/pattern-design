package com.co.softworld;

import com.co.softworld.concreteComponent.Text;
import com.co.softworld.concreteDecorator.TextLowerCaseDecorator;
import com.co.softworld.concreteDecorator.TextSeparatorDecorator;
import com.co.softworld.concreteDecorator.TextUpperCaseDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorApp {

    public static void main(String[] args) {

        Text text = new Text("My name is Gustavo Castro");

        TextUpperCaseDecorator textUpperCase = new TextUpperCaseDecorator(text);
        TextLowerCaseDecorator textLowerCase = new TextLowerCaseDecorator(textUpperCase);

        TextSeparatorDecorator textSeparatorUpperCase = new TextSeparatorDecorator(textUpperCase);
        TextSeparatorDecorator textSeparatorLowerCase = new TextSeparatorDecorator(textLowerCase);

        log.info("text: {}", text.formatText());
        log.info("textUpperCase: {}", textUpperCase.formatText());
        log.info("textLowerCase: {}", textLowerCase.formatText());
        log.info("textSeparatorUpperCase: {}", textSeparatorUpperCase.formatText());
        log.info("textSeparatorLowerCase: {}", textSeparatorLowerCase.formatText());
    }
}
