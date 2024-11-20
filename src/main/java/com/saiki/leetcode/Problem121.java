package com.saiki.leetcode;

/**
 * Problem121
 */
public class Problem121 {

  public static void main(String[] args) {
    int[] prices = { 7, 6, 4, 3, 1 };
    System.out.println(new Problem121().maxProfit(prices));
  }

  public int maxProfit(int[] prices) {
    int buyingPrice = prices[0];
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buyingPrice) {
        buyingPrice = prices[i];
      } else {
        int currentProfit = prices[i] - buyingPrice;
        profit = Math.max(profit, currentProfit);
      }
    }
    return profit;
  }
}
