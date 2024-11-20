package com.saiki.leetcode;

import java.util.Arrays;

/**
 * Problem14
 */
public class Problem14 {

  public static void main(String[] args) {

    String[] strs = { "dog", "racecar", "car" };
    System.out.println(new Problem14().longestCommonPrefix(strs));
  }

  public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    StringBuilder stringBuilder = new StringBuilder();

    int counter = 0;
    while (counter < strs[0].length() && counter < strs[strs.length - 1].length()
        && strs[0].charAt(counter) == strs[strs.length - 1].charAt(counter)) {
      stringBuilder.append(strs[0].charAt(counter));
      counter++;
    }

    return stringBuilder.toString();
  }
}
