package com.design.pattern.behavioral.iterator;

public class NameRepository {

    private final String[] names = {"John", "Jane", "Jack", "Bob"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
