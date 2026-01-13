package com.design.pattern.behavioral.observer.sample1.listenerImpl;

import com.design.pattern.behavioral.observer.sample1.EventListener;

public class EmailListener implements EventListener {

    private final String email;

    private final String message;

    public EmailListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.println("email :" + email + " fileName: " + fileName + " message: " + message);
    }
}
