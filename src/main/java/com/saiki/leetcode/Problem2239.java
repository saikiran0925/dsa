package com.saiki.leetcode;

/**
 * Problem2239
 */
public class Problem2239 {

  public static void main(String[] args) {
    Problem2239 problem2239 = new Problem2239();
    int[] nums = { -4, -2, 1, 4, 8 };
    System.out.println(problem2239.findClosestNumber(nums));
  }

  public int findClosestNumber(int[] nums) {
    int closestNumber = Integer.MAX_VALUE;
    for (int i : nums) {
      if (Math.abs(i) < Math.abs(closestNumber)
          || (Math.abs(i) == Math.abs(closestNumber) && i > closestNumber)) {
        closestNumber = i;
      }
    }
    return closestNumber;
  }
}
