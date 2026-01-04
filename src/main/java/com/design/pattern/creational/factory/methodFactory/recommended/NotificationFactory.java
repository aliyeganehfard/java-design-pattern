package com.design.pattern.creational.factory.methodFactory.recommended;

public abstract class NotificationFactory implements Notification{

   protected abstract Notification createNotification();

    @Override
    public void send() {
        var notification = createNotification();
        notification.send();
    }
}
