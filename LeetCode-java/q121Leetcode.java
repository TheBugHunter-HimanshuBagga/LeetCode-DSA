// Thi is q121 in Leetcode 
class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int profit = 0;

        for(int i = 1 ; i < prices.length ; i++){

            int maxprofit = prices[i] - minsofar;
            if(maxprofit > profit){ 
                profit = maxprofit;
            }
            
            if (prices[i] < minsofar) {
            minsofar = prices[i];
            }
        }
        return profit;
    }
}    