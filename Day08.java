// Day 8 - Stock Buy and Sell (With One Limit)

class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minSoFar;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            minSoFar = Math.min(minSoFar, prices[i]);
        }

        return maxProfit;
    }
}
