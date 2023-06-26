// ---------------> Memoization <--------------------

// class Solution {
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
        
//         int ans = dp1(n, dp);
        
//         return ans;
        
//     }
    
//     public int dp1(int n , int[] dp){
//         if(n <= 1){
//             return n;
//         }
        
//         if(dp[n] != -1){
//             return dp[n];
//         }
        
//         return dp[n] = dp1(n-1, dp) + dp1(n-2, dp);
//     }
// }


// ---------------> Tabulation <--------------------
// class Solution {
//     public int fib(int n) {
//        int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
        
//         if(n<=1) return n;
//         dp[0] = 0;
//         dp[1] = 1;
        
//         for(int i =2; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
        
//         return dp[n];
//     }
    
// }


// ---------------> Space Optimization <--------------------

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int prev2 = 0;
        int prev = 1;
        
        for(int i =2; i<=n; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        
        return prev;
    }
    
}