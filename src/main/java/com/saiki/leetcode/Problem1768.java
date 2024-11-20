package com.saiki.leetcode;

/**
 * Problem1768
 */
public class Problem1768 {

  public static void main(String[] args) {
    Problem1768 problem1768 = new Problem1768();
    String word1 = "ab";
    String word2 = "pqrs";
    System.out.println(problem1768.mergeAlternately(word1, word2));

  }

  public String mergeAlternately(String word1, String word2) {

    int length = Math.min(word1.length(), word2.length());
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < length; i++) {
      stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
    }
    if (word1.length() > word2.length()) {
      stringBuilder.append(word1.substring(length));
    } else {
      stringBuilder.append(word2.substring(length));
    }
    return stringBuilder.toString();
  }
}
