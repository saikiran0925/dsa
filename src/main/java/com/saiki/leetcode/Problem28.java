package com.saiki.leetcode;

/**
 * Problem28
 */
public class Problem28 {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(new Problem28().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
