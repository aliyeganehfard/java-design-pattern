package com.design.pattern.behavioral.command;

// client
public class Main {

    public static void main(String[] args) {


        var switcher = new Switcher();

        var light = new Light();

        var turnOn = new TurnOnCommand(light);
        var turnOff = new TurnOffCommand(light);

        switcher.add(turnOn);
        switcher.add(turnOff);

        switcher.executeCommands();
    }
}
