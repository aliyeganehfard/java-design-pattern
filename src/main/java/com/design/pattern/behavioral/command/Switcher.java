package com.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// invoker = carries a reference to a Command object
public class Switcher {

    private final List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void add(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
