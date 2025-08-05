package com.bridgelabz;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 5, 2};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > max) {
                second = max;
                max = value;
            } else if (value > second && value != max) {
                second = value;
            }
        }

        System.out.println("Second Highest: " + second);
    }
}
