package com.saiki.leetcode;

public class Problem35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(new Problem35().searchInsert(nums, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer) / 2;
            int value = nums[mid];

            if (value == target) {
                return mid;
            } else if (value > target) {
                rightPointer = mid - 1;
            } else {
                leftPointer = mid + 1;
            }
        }
        return leftPointer;
    }
}
