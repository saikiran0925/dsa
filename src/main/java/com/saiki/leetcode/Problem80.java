package com.saiki.leetcode;

import java.util.Arrays;

public class Problem80 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(new Problem80().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2 && nums[i] == nums[i + 2]) {
                continue;
            }
            nums[counter] = nums[i];
            counter++;
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}
