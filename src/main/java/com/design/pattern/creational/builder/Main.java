package com.design.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        var person = new Person.Builder(1, "ali","yeganefard")
                .setAge(23)
                .setFatherName("test")
                .build();

        System.out.println(person);
    }
}
