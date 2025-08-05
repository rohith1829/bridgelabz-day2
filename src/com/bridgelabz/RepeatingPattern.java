package com.bridgelabz;

public class RepeatingPattern {
    public static void main(String[] args) {
        String str = "abcabcabc";
        int len = str.length();

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String part = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < len / i; j++) sb.append(part);
                if (sb.toString().equals(str)) {
                    System.out.println("Pattern: " + part);
                    break;
                }
            }
        }
    }
}
