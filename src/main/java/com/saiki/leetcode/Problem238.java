package com.saiki.leetcode;

import java.util.Arrays;

/**
 * Problem238
 */
public class Problem238 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Problem238().productExceptSelf(new int[]{1, 2, 3, 4})));
  }

  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;

    int[] result = new int[n];

    int leftProduct = 1;
    for (int i = 0; i < n; i++) {
      result[i] = leftProduct;
      leftProduct *= nums[i];
    }

    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
      result[i] *= rightProduct;
      rightProduct *= nums[i];
    }

    return result;
  }
}
