package com.design.pattern.creational.singleton;


// lazy singleton
public class DatabaseConnector {

    public final static DatabaseConnector INSTANCE = new DatabaseConnector();

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
