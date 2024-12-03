package com.saiki.leetcode;

public class Problem9 {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(new Problem9().isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String string = Integer.toString(x);
        int leftPointer = 0;
        int rightPointer = string.length() - 1;
        while (leftPointer < rightPointer) {
            if (string.charAt(leftPointer) != string.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
