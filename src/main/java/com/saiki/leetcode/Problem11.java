package com.saiki.leetcode;

public class Problem11 {
    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(new Problem11().maxArea(height));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));
            while (left < right && height[left] <= h) {
                left++;
            }

            while (left < right && height[right] <= h) {
                right--;
            }
        }
        return max;
    }
}
