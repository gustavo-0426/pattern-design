package com.co.softworld;

import com.co.softworld.command.ICommand;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invoker {

    private ICommand command;

    public void run() {
        command.execute();
    }
}
