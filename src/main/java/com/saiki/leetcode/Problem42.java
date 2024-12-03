package com.saiki.leetcode;

public class Problem42 {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(new Problem42().trap(height));
    }

    public int trap(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterLevel = 0;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                if (height[leftPointer] >= leftMax) {
                    leftMax = height[leftPointer];
                } else {
                    waterLevel += leftMax - height[leftPointer];
                }
                leftPointer++;
            } else {
                if (height[rightPointer] >= rightMax) {
                    rightMax = height[rightPointer];
                } else {
                    waterLevel += rightMax - height[rightPointer];
                }
                rightPointer--;
            }
        }
        return waterLevel;
    }
}
