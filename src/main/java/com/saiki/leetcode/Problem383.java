package com.saiki.leetcode;

public class Problem383 {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(new Problem383().canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[26];

        for (char c : magazine.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (chars[c - 'a'] == 0) return false;
            chars[c - 'a']--;
        }
        return true;
    }
}
