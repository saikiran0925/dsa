package com.saiki.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        System.out.println(getFlattenMap(listOfLists));

    }

    public static List<Integer> getFlattenMap(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
