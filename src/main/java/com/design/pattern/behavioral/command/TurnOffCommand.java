package com.design.pattern.behavioral.command;

public class TurnOffCommand implements Command {

    private final Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.turnOff();
    }
}
