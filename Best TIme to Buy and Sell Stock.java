public class Solution {
    /*
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if ((prices == null) || (prices.length == 0)) {
            return 0;
        }
        int min_price = prices[0];
        int max_profit = prices[1] - prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            if ((prices[i] - min_price) > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }
}