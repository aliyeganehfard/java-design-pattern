package com.design.pattern.creational.factory.abstractFactory.variants.classic;

import com.design.pattern.creational.factory.abstractFactory.products.Chair;

public class ClassicChair implements Chair {
    @Override
    public void show() {
        System.out.println("classic chair");
    }
}
