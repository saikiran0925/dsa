package com.saiki.leetcode;

public class Problem169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(new Problem169().majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }
}
