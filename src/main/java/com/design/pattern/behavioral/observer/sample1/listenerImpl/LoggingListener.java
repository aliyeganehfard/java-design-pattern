package com.design.pattern.behavioral.observer.sample1.listenerImpl;

import com.design.pattern.behavioral.observer.sample1.EventListener;

public class LoggingListener implements EventListener {

    private final String file;

    private final String message;

    public LoggingListener(String file, String message) {
        this.file = file;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.println("log file :" + file + " fileName: " + fileName + " message: " + message);
    }
}
