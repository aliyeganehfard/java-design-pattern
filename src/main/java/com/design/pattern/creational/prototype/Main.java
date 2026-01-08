package com.design.pattern.creational.prototype;

public class Main {

    public static void main(String[] args) {

        var rec = new Rectangle(10, 20, "red");
        System.out.println(rec);

        var rec2 = rec.clone();
        System.out.println(rec2);
    }
}
