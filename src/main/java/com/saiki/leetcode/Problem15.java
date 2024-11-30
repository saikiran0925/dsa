package com.saiki.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem15
 */
public class Problem15 {

    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = problem15.threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(list.toString());
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int current = 0; current < nums.length - 2; current++) {
            int leftIndex = current + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                int total = nums[current] + nums[leftIndex] + nums[rightIndex];
                if (total == 0) {
                    resultSet.add(List.of(nums[current], nums[leftIndex], nums[rightIndex]));
                    leftIndex++;
                    rightIndex--;
                } else if (total < 0) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
