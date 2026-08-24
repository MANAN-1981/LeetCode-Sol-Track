// Last updated: 8/24/2026, 9:42:41 PM
class Solution {
    public int maxProfit(int[] prices) {
       
      int maxProfit = 0;
      int profit = 0;

      int minPrice = prices[0];

      for (int i = 1; i<prices.length; i++){
        if (prices[i] < minPrice){
            minPrice = prices[i];
        }
        profit = prices[i] - minPrice;

        if (profit>maxProfit){
            maxProfit = profit;
        }

      }
      return maxProfit;
    }
}