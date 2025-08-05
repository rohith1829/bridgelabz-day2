package com.bridgelabz;

import java.util.*;

public class RearrangeCharacters {
    public static void main(String[] args) {
        String str = "aaabbc";
        int[] freq = new int[26];
        for (char c : str.toCharArray()) freq[c - 'a']++;

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq[b - 'a'] - freq[a - 'a']);
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq[c - 'a'] > 0) pq.add(c);
        }

        StringBuilder result = new StringBuilder();
        Character prev = null;

        while (!pq.isEmpty()) {
            char current = pq.poll();
            result.append(current);
            freq[current - 'a']--;

            if (prev != null && freq[prev - 'a'] > 0) pq.add(prev);
            prev = (freq[current - 'a'] > 0) ? current : null;
        }

        System.out.println(result.length() == str.length() ? result.toString() : "Not possible");
    }
}
