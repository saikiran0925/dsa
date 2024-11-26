package com.saiki.leetcode;

/**
 * Problem643
 */
public class Problem643 {

  public static void main(String[] args) {
    int[] nums = { 5 };
    int k = 1;
    System.out.println(new Problem643().findMaxAverage(nums, k));

  }

  public double findMaxAverage(int[] nums, int k) {
    int initAverage = 0;
    for (int i = 0; i < k; i++) {
      initAverage += nums[i];
    }
    int maxAverage = initAverage;

    int startIndex = 0;
    int endIndex = k;
    while (endIndex < nums.length) {
      initAverage -= nums[startIndex];
      startIndex++;

      initAverage += nums[endIndex];
      endIndex++;

      maxAverage = Math.max(initAverage, maxAverage);
    }
    return (double) maxAverage / k;
  }
}
