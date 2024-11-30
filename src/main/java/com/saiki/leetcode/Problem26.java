package com.saiki.leetcode;

import java.util.Arrays;

/**
 * Problem26
 */
public class Problem26 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Problem26().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[counter] = nums[i];
            counter++;
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}
