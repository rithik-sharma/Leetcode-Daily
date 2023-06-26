class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return dp1(n, dp);
    }
    
    public int dp1(int n , int[] dp){
        if(n == 2){
            return 1;
        }
        if(n <= 1){
            return n;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        return dp[n] = dp1(n-1, dp) + dp1(n-2 , dp)+ dp1(n-3 , dp);
    }
}