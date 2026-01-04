package com.design.pattern.creational.factory.methodFactory.recommended;

public class SmsFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}
