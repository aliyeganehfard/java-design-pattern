package com.design.pattern.creational.factory.abstractFactory.factory;

import com.design.pattern.creational.factory.abstractFactory.products.Chair;
import com.design.pattern.creational.factory.abstractFactory.products.CoffeeTable;
import com.design.pattern.creational.factory.abstractFactory.products.Sofa;
import com.design.pattern.creational.factory.abstractFactory.variants.modern.ModernChair;
import com.design.pattern.creational.factory.abstractFactory.variants.modern.ModernCoffeeTable;
import com.design.pattern.creational.factory.abstractFactory.variants.modern.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
