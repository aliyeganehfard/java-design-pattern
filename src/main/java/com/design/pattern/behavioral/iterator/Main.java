package com.design.pattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        var nameRepository = new NameRepository();

        for (var it = nameRepository.getIterator(); it.hasNext(); ) {
            var name = it.next();
            System.out.println(name);
        }
    }
}
