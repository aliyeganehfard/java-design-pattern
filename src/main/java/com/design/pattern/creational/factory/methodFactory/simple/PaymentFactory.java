package com.design.pattern.creational.factory.methodFactory.simple;

public class PaymentFactory {

    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("card")) {
            return new CardPayment();
        } else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();
        }
        throw new IllegalArgumentException("Unsupported payment type");
    }
}
