package com.design.pattern.behavioral.strategy.impl;

import com.design.pattern.behavioral.strategy.Strategy;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public double execute(int a, int b) {
        return a - b;
    }
}
