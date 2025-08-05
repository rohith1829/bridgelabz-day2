package com.bridgelabz;

public class MissingInAP {
    public static void main(String[] args) {
        int[] arr = {2, 6, 10, 14, 18};
        int n = arr.length + 1;
        int diff = (arr[arr.length - 1] - arr[0]) / n;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                System.out.println("Missing: " + (arr[i] + diff));
                break;
            }
        }
    }
}
