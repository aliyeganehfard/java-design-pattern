package com.design.pattern.creational.factory.methodFactory.recommended;

public class EmailFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
