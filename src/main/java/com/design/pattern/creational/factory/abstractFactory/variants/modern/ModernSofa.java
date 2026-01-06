package com.design.pattern.creational.factory.abstractFactory.variants.modern;

import com.design.pattern.creational.factory.abstractFactory.products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void show() {
        System.out.println("Modern sofa");
    }
}
