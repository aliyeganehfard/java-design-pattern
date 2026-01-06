package com.design.pattern.creational.factory.abstractFactory;

import com.design.pattern.creational.factory.abstractFactory.factory.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        var modern = new ModernFurnitureFactory();
        var mCT = modern.createCoffeeTable();
        var mC = modern.createChair();
        var mS = modern.createSofa();

        mCT.show();
        mC.show();
        mS.show();
    }
}
