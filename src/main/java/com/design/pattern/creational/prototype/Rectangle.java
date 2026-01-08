package com.design.pattern.creational.prototype;

public class Rectangle extends Shape {

    private final String color;

    public Rectangle(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void name() {
        System.out.println("rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
               "color='" + color + '\'' +
               "} " + super.toString();
    }
}
