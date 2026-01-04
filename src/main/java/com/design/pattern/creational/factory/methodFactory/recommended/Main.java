package com.design.pattern.creational.factory.methodFactory.recommended;

public class Main {
    public static void main(String[] args) {

        NotificationFactory factory = new EmailFactory();
        factory.send();
    }
}
