package com.design.pattern.creational.factory.abstractFactory.factory;

import com.design.pattern.creational.factory.abstractFactory.products.Chair;
import com.design.pattern.creational.factory.abstractFactory.products.CoffeeTable;
import com.design.pattern.creational.factory.abstractFactory.products.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
