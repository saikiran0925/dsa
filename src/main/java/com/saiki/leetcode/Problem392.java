package com.saiki.leetcode;

/**
 * Problem392
 */
public class Problem392 {

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(new Problem392().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < s.length() && secondIndex < t.length()) {
            if (s.charAt(firstIndex) == t.charAt(secondIndex)) {
                firstIndex++;
                secondIndex++;
            } else {
                secondIndex++;
            }
        }
        return (firstIndex == s.length());
    }
}
