class Solution {
    public int maxProfit(int[] prices) {

        // optimal approach
        int n = prices.length;
      int maxProfit = 0;
      int mini = prices[0];

      
     for(int i =0 ; i<n ; i++){

        mini = Math.min(prices[i] ,mini);

        int currProfit = prices[i]-mini;

        maxProfit = Math.max(maxProfit , currProfit);
     }
        return maxProfit;
    }
}