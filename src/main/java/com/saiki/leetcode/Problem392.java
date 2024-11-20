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
    int firstStringIndex = 0;
    int secondStringIndex = 0;

    while (firstStringIndex < s.length() && secondStringIndex < t.length()) {
      if (s.charAt(firstStringIndex) == t.charAt(secondStringIndex)) {
        firstStringIndex++;
        secondStringIndex++;
      } else {
        secondStringIndex++;
      }
    }
    return (firstStringIndex == s.length());
  }
}
