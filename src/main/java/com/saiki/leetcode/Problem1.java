package com.saiki.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem1
 */
public class Problem1 {

  public static void main(String[] args) {
    Problem1 problem1 = new Problem1();
    int[] nums = { 3, 2, 4 };
    int target = 6;
    int[] result = problem1.twoSum(nums, target);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      } else {
        map.put(nums[i], i);
      }
    }
    throw new IllegalArgumentException("No solution found");
  }
}
