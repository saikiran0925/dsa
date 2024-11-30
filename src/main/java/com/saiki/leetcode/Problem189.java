package com.saiki.leetcode;

import java.util.Arrays;

public class Problem189 {
    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        Problem189 problem189 = new Problem189();
        problem189.rotate(nums, 2);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseTheArray(nums, 0, nums.length - 1);
        reverseTheArray(nums, 0, k - 1);
        reverseTheArray(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverseTheArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
