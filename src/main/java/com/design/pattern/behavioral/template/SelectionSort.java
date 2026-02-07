package com.design.pattern.behavioral.template;

public class SelectionSort extends Algorithm{

    public SelectionSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("init selection sort");
    }

    @Override
    protected void sorting() {
        System.out.println("sort selection");
    }

    @Override
    protected void showResult() {
        System.out.println("show selection sort");
    }
}
