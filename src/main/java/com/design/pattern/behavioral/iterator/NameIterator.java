package com.design.pattern.behavioral.iterator;

public class NameIterator implements Iterator {

    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return names[index++];
        } else {
            return null;
        }
    }
}
