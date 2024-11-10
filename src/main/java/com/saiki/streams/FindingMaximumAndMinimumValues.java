package com.saiki.streams;

import java.util.List;
import java.util.Optional;

public class FindingMaximumAndMinimumValues {
    public static void main(String[] args) {
        System.out.println(getMinValues(List.of(1.5f, 3.8f, -2.4f, 7.9f, 0.2f)).orElse(null));
        System.out.println(getMaxValues(List.of(1.5f, 3.8f, -2.4f, 7.9f, 0.2f)).orElse(null));
    }

    public static Optional<Float> getMinValues(List<Float> givenList) {
        return givenList.stream()
                .reduce((a, b) -> a < b ? a : b);
    }

    public static Optional<Float> getMaxValues(List<Float> givenList) {
        return givenList.stream()
                .reduce((a, b) -> a > b ? a : b);
    }
}
