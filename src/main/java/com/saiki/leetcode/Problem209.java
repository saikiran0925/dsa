package com.saiki.leetcode;

public class Problem209 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(new Problem209().minSubArrayLen(11, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int leftPointer = 0;
        int currentSum = 0;

        for (int rightPointer = 0; rightPointer < n; rightPointer++) {
            currentSum += nums[rightPointer];

            while (currentSum >= target) {
                minLength = Math.min(minLength, rightPointer - leftPointer + 1);
                currentSum -= nums[leftPointer];
                leftPointer++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
