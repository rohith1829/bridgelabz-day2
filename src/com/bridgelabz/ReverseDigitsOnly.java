package com.bridgelabz;

public class ReverseDigitsOnly {
    public static void main(String[] args) {
        String input = "a1b2c3d4";
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isDigit(chars[left])) {
                left++;
            } else if (!Character.isDigit(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(chars));
    }
}
