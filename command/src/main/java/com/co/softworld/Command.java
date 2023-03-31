package com.co.softworld;

import com.co.softworld.command.CreditApprovedCommand;
import com.co.softworld.command.DebitApprovedCommand;
import com.co.softworld.command.DebitFailedCommand;

public class Command {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new CreditApprovedCommand(receiver));
        invoker.run();

        invoker = new Invoker(new DebitApprovedCommand(receiver));
        invoker.run();

        invoker = new Invoker(new DebitFailedCommand(receiver));
        invoker.run();
    }

}
