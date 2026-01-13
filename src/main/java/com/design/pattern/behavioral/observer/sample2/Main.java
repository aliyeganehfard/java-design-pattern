package com.design.pattern.behavioral.observer.sample2;

public class Main {
    public static void main(String[] args) {
        var stockExchange = new StockExchange();
        stockExchange.addObserver(new BuyStockListener());
        stockExchange.addObserver(new SellStockListener());
        stockExchange.start();
    }
}
