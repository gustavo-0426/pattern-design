package com.co.softworld.command;

import com.co.softworld.Receiver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DebitFailedCommand implements ICommand {

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.failed();
        receiver.debitInvalid();
    }
}
