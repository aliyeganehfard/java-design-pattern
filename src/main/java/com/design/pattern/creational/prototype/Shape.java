package com.design.pattern.creational.prototype;

public abstract class Shape implements Cloneable {

    private final int x;
    private final int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void name();

    @Override
    public String toString() {
        return "Shape{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }

    @Override
    public Shape clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
