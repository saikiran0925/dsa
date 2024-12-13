package com.saiki.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem128 {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(new Problem128().longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxLength = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
}
