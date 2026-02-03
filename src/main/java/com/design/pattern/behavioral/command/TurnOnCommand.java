package com.design.pattern.behavioral.command;

public class TurnOnCommand implements Command {

    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
