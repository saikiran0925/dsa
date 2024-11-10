package com.saiki.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringsToUppercase {
    public static void main(String[] args) {
        System.out.println(getUpperCaseStringsList(List.of("hello", "world")));
        System.out.println(getUpperCaseStringsList(List.of("sai", "kiran")));
    }

    public static List<String> getUpperCaseStringsList(List<String> givenList) {
        return givenList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
