package com.design.pattern.creational.factory.abstractFactory.factory;

import com.design.pattern.creational.factory.abstractFactory.products.Chair;
import com.design.pattern.creational.factory.abstractFactory.products.CoffeeTable;
import com.design.pattern.creational.factory.abstractFactory.products.Sofa;
import com.design.pattern.creational.factory.abstractFactory.variants.classic.ClassicChair;
import com.design.pattern.creational.factory.abstractFactory.variants.classic.ClassicCoffeeTable;
import com.design.pattern.creational.factory.abstractFactory.variants.classic.ClassicSofa;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ClassicCoffeeTable();
    }
}
