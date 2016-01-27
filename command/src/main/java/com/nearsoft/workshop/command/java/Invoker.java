package com.nearsoft.workshop.command.java;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> executedCommands = new ArrayList<>();

    public void executeCommand(Command purchase) {
        purchase.execute();
        executedCommands.add(purchase);
    }

    public void replay(){
        for (Command command : executedCommands) {
            command.execute();
        }
    }
}
