package com.co.softworld;

import com.co.softworld.concreteComponent.Text;
import com.co.softworld.concreteDecorator.TextLowerCaseDecorator;
import com.co.softworld.concreteDecorator.TextSeparatorDecorator;
import com.co.softworld.concreteDecorator.TextUpperCaseDecorator;
import lombok.extern.slf4j.Slf4j;

import static java.lang.String.format;

@Slf4j
public class DecoratorApp {

    public static void main(String[] args) {
        Text text = new Text("My name is Gustavo Castro");
        TextUpperCaseDecorator textUpperCase = new TextUpperCaseDecorator(text);
        TextSeparatorDecorator textSeparatorUpperCase = new TextSeparatorDecorator(textUpperCase);
        TextLowerCaseDecorator textLowerCase = new TextLowerCaseDecorator(textUpperCase);
        TextSeparatorDecorator textSeparatorLowerCase = new TextSeparatorDecorator(textLowerCase);

        log.info(format("text: %s", text.formatText()));
        log.info(format("textUpperCase: %s", textUpperCase.formatText()));
        log.info(format("textSeparatorUpperCase: %s", textSeparatorUpperCase.formatText()));
        log.info(format("textLowerCase: %s", textLowerCase.formatText()));
        log.info(format("textSeparatorLowerCase: %s", textSeparatorLowerCase.formatText()));
    }
}
