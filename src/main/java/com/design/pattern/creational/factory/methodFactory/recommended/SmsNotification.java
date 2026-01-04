package com.design.pattern.creational.factory.methodFactory.recommended;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
