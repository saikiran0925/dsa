package com.saiki.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new Problem3().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int maxLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= leftPointer) {
                leftPointer = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - leftPointer + 1);
        }
        return maxLength;
    }
}
