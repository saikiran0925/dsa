package com.saiki.leetcode;

/**
 * Problem125
 */
public class Problem125 {

  public static void main(String[] args) {
    Problem125 problem125 = new Problem125();
    String s = "A man, a plan, a canal: Panama";
    String as = "race a car";
    System.out.println(problem125.isPalindrome(s));
    System.out.println(problem125.isPalindrome(as));
  }

  public boolean isPalindrome(String s) {
    int leftPointerIndex = 0;
    int rightPointerIndex = s.length() - 1;
    while (leftPointerIndex < rightPointerIndex) {

      while (leftPointerIndex < rightPointerIndex && !Character.isLetterOrDigit(s.charAt(leftPointerIndex))) {
        leftPointerIndex++;
      }

      while (leftPointerIndex < rightPointerIndex && !Character.isLetterOrDigit(s.charAt(rightPointerIndex))) {
        rightPointerIndex--;
      }

      if (Character.toLowerCase(s.charAt(leftPointerIndex)) != Character.toLowerCase(s.charAt(rightPointerIndex))) {
        return false;
      }

      leftPointerIndex++;
      rightPointerIndex--;
    }
    return true;
  }
}
