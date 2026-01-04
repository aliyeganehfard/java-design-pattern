package com.design.pattern.creational.factory.methodFactory.simple;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("paying with card");
    }
}
