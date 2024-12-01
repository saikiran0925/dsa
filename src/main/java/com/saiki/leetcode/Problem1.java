package com.saiki.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem1
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(new Problem1().twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
