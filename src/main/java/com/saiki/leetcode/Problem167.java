package com.saiki.leetcode;

/**
 * Problem167
 */
public class Problem167 {

    public static void main(String[] args) {
        Problem167 problem167 = new Problem167();
        int[] numbers = {2, 7, 11, 15};
        int[] result = problem167.twoSum(numbers, 13);
        for (int number : result) {
            System.out.println(number);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if (sum == target) {
                result[0] = leftPointer + 1;
                result[1] = rightPointer + 1;
                return result;
            } else if (sum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return result;
    }
}
