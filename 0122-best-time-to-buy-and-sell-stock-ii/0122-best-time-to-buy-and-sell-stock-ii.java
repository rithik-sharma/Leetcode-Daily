class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int leastSoFar = Integer.MAX_VALUE;
        int profit_each_time = 0;
        int overall_profit = 0;
        for(int i =0; i<n; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            profit_each_time = prices[i] - leastSoFar;
            if(profit_each_time > 0){
                overall_profit = overall_profit + profit_each_time;
                leastSoFar = prices[i];
            }
        }
        
        return overall_profit;
    }
}