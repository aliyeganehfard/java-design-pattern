package com.design.pattern.behavioral.template;

public class Bubble extends Algorithm{

    public Bubble(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("init bubble sort");
    }

    @Override
    protected void sorting() {
        System.out.println("sort bubble");
    }

    @Override
    protected void showResult() {
        System.out.println("show bubble sort");
    }
}
