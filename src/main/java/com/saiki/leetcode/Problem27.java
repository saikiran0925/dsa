package com.saiki.leetcode;

import java.util.Arrays;

public class Problem27 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new Problem27().removeElement(nums, 2));
    }

    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[counter] = nums[i];
            counter++;
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}
