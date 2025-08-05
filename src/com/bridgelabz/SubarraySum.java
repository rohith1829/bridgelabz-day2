package com.bridgelabz;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        int start = 0, currSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];

            while (currSum > sum) {
                currSum -= arr[start++];
            }

            if (currSum == sum) {
                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            }
        }
    }
}

