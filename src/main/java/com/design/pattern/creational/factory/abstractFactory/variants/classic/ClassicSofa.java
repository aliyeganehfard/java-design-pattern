package com.design.pattern.creational.factory.abstractFactory.variants.classic;

import com.design.pattern.creational.factory.abstractFactory.products.Sofa;

public class ClassicSofa implements Sofa {
    @Override
    public void show() {
        System.out.println("classic sofa");
    }
}
