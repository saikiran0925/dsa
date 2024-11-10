package com.saiki.streams;

import java.util.List;

public class CountWordsThatStartWithASpecificLetter {
    public static void main(String[] args) {
        System.out.println(getCount(List.of("apple", "banana", "avocado", "cherry", "apricot", "blueberry"), 'a'));
        System.out.println(getCount(List.of("apple", "banana", "avocado", "cherry", "apricot", "blueberry"), 'b'));
    }

    public static long getCount(List<String> givenList, Character character) {
        return givenList.stream()
                .filter(c -> c.toLowerCase().charAt(0) == Character.toLowerCase(character))
                .count();
    }
}
