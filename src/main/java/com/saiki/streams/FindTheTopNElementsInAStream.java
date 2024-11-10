package com.saiki.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheTopNElementsInAStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60);
        int n = 3;
        System.out.println(getTopNElements(stream, n));
    }

    public static List<Integer> getTopNElements(Stream<Integer> stream, int n) {
        return stream.sorted(Comparator.reverseOrder()).limit(n).collect(Collectors.toList());
    }
}
