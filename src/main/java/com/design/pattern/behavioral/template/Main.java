package com.design.pattern.behavioral.template;

public class Main {
    public static void main(String[] args) {

        var nums = new int[]{1, 3, 4};
        var algorithm = new SelectionSort(nums);

        algorithm.sort();
    }
}
