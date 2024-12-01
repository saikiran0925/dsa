package com.saiki.leetcode;

import java.util.*;

public class Problem49 {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Problem49().groupAnagrams(input).toString());

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String originalString : strs) {
            char[] charArray = originalString.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(originalString);
        }
        return new ArrayList<>(map.values());
    }
}
