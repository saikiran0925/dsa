package com.saiki.leetcode;

import java.util.Arrays;

/**
 * Problem88
 */
public class Problem88 {

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    System.out.println(Arrays.toString(new Problem88().merge(nums1, 3, nums2, 3)));
  }

  public int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int pointerOne = m - 1;
    int pointerTwo = n - 1;
    int pointerThree = m + n - 1;

    while (pointerOne >= 0 && pointerTwo >= 0) {
      if (nums1[pointerOne] > nums2[pointerTwo]) {
        nums1[pointerThree] = nums1[pointerOne];
        pointerOne--;
      } else {
        nums1[pointerThree] = nums2[pointerTwo];
        pointerTwo--;
      }
      pointerThree--;
    }

    while (pointerTwo >= 0) {
      nums1[pointerThree] = nums2[pointerTwo];
      pointerTwo--;
      pointerThree--;
    }
    return nums1;
  }
}
