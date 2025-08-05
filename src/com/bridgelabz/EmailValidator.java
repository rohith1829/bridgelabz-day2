package com.bridgelabz;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println(isValidEmail("test@gmail.com"));
        System.out.println(isValidEmail("invalid@com"));
    }

    static boolean isValidEmail(String email) {
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        if (at < 1 || dot < at + 2 || dot >= email.length() - 1) return false;
        if (email.contains("..") || email.contains(" ")) return false;
        return true;
    }
}

