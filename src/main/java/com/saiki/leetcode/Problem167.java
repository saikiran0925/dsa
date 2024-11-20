package com.saiki.leetcode;

/**
 * Problem167
 */
public class Problem167 {

  public static void main(String[] args) {
    Problem167 problem167 = new Problem167();
    int[] numbers = { 2, 7, 11, 15 };
    int[] result = problem167.twoSum(numbers, 13);
    for (int number : result) {
      System.out.println(number);
    }
  }

  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    int leftPointerIndex = 0;
    int rightPointerIndex = numbers.length - 1;
    while (leftPointerIndex < rightPointerIndex) {
      int totalSum = numbers[leftPointerIndex] + numbers[rightPointerIndex];
      if (totalSum == target) {
        result[0] = leftPointerIndex;
        result[1] = rightPointerIndex;
        return result;
      } else if (totalSum > target) {
        rightPointerIndex--;
      } else {
        leftPointerIndex++;
      }
    }
    return result;
  }
}
