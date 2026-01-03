package com.design.pattern.creational.singleton;

public class DatabaseConnectorLazy {

    private static DatabaseConnectorLazy INSTANCE;

    private DatabaseConnectorLazy() {}

    public static synchronized DatabaseConnectorLazy getInstance() {
        if(INSTANCE == null) {
            synchronized (DatabaseConnectorLazy.class) {
                INSTANCE = new DatabaseConnectorLazy();
            }
        }
        return INSTANCE;
    }
}
