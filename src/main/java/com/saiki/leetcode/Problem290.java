package com.saiki.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(new Problem290().wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> charToWord = new HashMap();
        int index = 0;
        for (Character c : pattern.toCharArray()) {
            if (!charToWord.containsKey(c)) {
                if (charToWord.containsValue(words[index])) return false;
                charToWord.put(c, words[index]);
                index++;
                continue;
            }

            if (!charToWord.get(c).equals(words[index])) return false;
            index++;
        }
        return true;
    }
}
