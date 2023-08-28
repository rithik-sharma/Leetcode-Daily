class Solution {
    public int maxProfit(int[] prices) {
       int leastSoFar = Integer.MAX_VALUE;
       int profit_if_sold_today = 0;
       int Overall_profit = 0;
        
        for(int i =0; i<prices.length; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            
            profit_if_sold_today = prices[i] - leastSoFar;
            
            if(Overall_profit < profit_if_sold_today){
                Overall_profit = profit_if_sold_today;
            }
            
        }
        
        return Overall_profit;
    }
}