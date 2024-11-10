package com.saiki.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMappingBasics {
    public static void main(String[] args) {
        System.out.println(getFilteredList(List.of(1, 2, 3, 4, 5)));
    }

    public static List<Integer> getFilteredList(List<Integer> givenList) {
        return givenList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
