package com.saiki.leetcode;

import java.util.Map;
import java.util.HashMap;

public class Problem205 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(new Problem205().isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        int index = 0;
        while (index < s.length()) {
            if (!charMap.containsKey(s.charAt(index))) {
                if (charMap.containsValue(t.charAt(index))) return false;
                charMap.put(s.charAt(index), t.charAt(index));
                index++;
                continue;
            }
            if (charMap.get(s.charAt(index)) != t.charAt(index)) {
                return false;
            }
            index++;
        }
        return true;
    }
}
