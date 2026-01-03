package com.design.pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {

        // eager
        var db1 = DatabaseConnectorEager.INSTANCE;
        db1.connect();
        db1.disconnect();

        var db2 = DatabaseConnectorEager.INSTANCE;

        // lazy
        var dbLazy1 = DatabaseConnectorLazy.getInstance();

        // enum
        var dbEnum = DatabaseConnectorEnum.INSTANCE;
        dbEnum.connect();
    }
}
