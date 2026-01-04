package com.design.pattern.creational.factory.methodFactory.simple;

import com.design.pattern.creational.factory.methodFactory.recommended.EmailFactory;
import com.design.pattern.creational.factory.methodFactory.recommended.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        var payment = PaymentFactory.createPayment("card");
        payment.pay();

    }
}
