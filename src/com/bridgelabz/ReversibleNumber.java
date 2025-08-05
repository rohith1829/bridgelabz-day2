package com.bridgelabz;

public class ReversibleNumber {
    public static void main(String[] args) {
        int num = 36;
        int rev = reverse(num);
        int sum = num + rev;

        boolean allOdd = true;
        while (sum > 0) {
            int digit = sum % 10;
            if (digit % 2 == 0) {
                allOdd = false;
                break;
            }
            sum /= 10;
        }

        System.out.println("Reversible? " + allOdd);
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}

