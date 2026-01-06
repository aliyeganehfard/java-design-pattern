package com.design.pattern.creational.factory.abstractFactory.variants.classic;

import com.design.pattern.creational.factory.abstractFactory.products.CoffeeTable;

public class ClassicCoffeeTable implements CoffeeTable {
    @Override
    public void show() {
        System.out.println("classic coffee table");
    }
}
