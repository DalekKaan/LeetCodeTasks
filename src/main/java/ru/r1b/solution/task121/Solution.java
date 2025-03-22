package ru.r1b.solution.task121;

/**
 * 121. Best Time to Buy and Sell Stock
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxDiff = 0;
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            maxDiff = Math.max(maxDiff, price - minPrice);
        }
        return maxDiff;
    }
}
