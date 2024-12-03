package com.saiki.leetcode;

public class Problem151 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(new Problem151().reverseWords(s));
    }

    public String reverseWords(String s) {
        String trimmedSentence = s.trim();
        String[] words = trimmedSentence.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
