package com.design.pattern.creational.factory.abstractFactory.variants.modern;

import com.design.pattern.creational.factory.abstractFactory.products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void show() {
        System.out.println("modern coffee table");
    }
}
