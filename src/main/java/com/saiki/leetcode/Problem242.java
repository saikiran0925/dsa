package com.saiki.leetcode;

import java.util.Locale;

public class Problem242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(new Problem242().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charArray[s.charAt(i) - 'a']++;
            charArray[t.charAt(i) - 'a']--;
        }

        for (int c : charArray) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
