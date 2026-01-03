package com.design.pattern.creational.singleton;

public enum DatabaseConnectorEnum {

    INSTANCE;

    public void connect() {
        System.out.println("database connector is connected");
    }

    public void disconnect() {
        System.out.println("database connector is disconnected");
    }
}
