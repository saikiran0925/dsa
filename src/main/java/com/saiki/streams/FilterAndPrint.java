package com.saiki.streams;

import java.util.List;

public class FilterAndPrint {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
