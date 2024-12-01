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
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            }

            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            }

            if (Character.toLowerCase(s.charAt(rightIndex)) != Character.toLowerCase(s.charAt(leftIndex))) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
