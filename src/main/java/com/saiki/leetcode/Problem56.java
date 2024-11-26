package com.saiki.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Problem56
 */
public class Problem56 {

  public static void main(String[] args) {

  }

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    LinkedList<int[]> mergedList = new LinkedList<>();

    for (int[] interval : intervals) {
      if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
        mergedList.add(interval);
      } else {
        mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
      }
    }

    return mergedList.toArray(new int[mergedList.size()][]);
  }
}
