package com.saiki.leetcode;

public class Problem1455 {

    public static void main(String[] args) {
        String sentence = "hello from the other side";
        String searchWord = "they";
        System.out.println(
            new Problem1455().isPrefixOfWord(sentence, searchWord)
        );
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
