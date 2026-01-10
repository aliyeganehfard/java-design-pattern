package com.design.pattern.behavioral.strategy;

public class StrategyContext {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
