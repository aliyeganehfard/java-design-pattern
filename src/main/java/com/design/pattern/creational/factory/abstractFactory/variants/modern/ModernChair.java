package com.design.pattern.creational.factory.abstractFactory.variants.modern;

import com.design.pattern.creational.factory.abstractFactory.products.Chair;

public class ModernChair implements Chair {
    @Override
    public void show() {
        System.out.println("Modern Chair");
    }
}
