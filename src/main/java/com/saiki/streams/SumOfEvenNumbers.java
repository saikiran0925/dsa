package com.saiki.streams;

import java.util.List;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(getTheSum(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(getTheSum(List.of(3, 4, 7, 10, 12)));
        System.out.println(getTheSum(List.of(9,10,12)));
    }

    public static int getTheSum(List<Integer> integerList) {
        return integerList.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
