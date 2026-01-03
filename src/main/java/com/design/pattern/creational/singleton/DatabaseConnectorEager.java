package com.design.pattern.creational.singleton;


// eager singleton
// thread safe
public class DatabaseConnectorEager {

    public final static DatabaseConnectorEager INSTANCE = new DatabaseConnectorEager();

    private DatabaseConnectorEager() {

    }

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
