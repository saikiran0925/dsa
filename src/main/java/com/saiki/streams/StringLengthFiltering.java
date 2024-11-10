package com.saiki.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthFiltering {
    public static void main(String[] args) {
        System.out.println(getFilteredList(List.of("apple", "bat", "cat", "elephant")));
    }

    public static List<String> getFilteredList(List<String> givenList) {
        return givenList.stream()
                .filter(a -> a.length() > 4)
                .sorted()
                .collect(Collectors.toList());
    }
}
