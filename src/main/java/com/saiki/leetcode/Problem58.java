package com.saiki.leetcode;

public class Problem58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(new Problem58().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].trim().length();
    }
}
