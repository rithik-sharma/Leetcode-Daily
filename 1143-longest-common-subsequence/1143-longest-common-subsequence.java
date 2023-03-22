class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
         int[][] dp = new int[n][m];
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                dp[i][j] = -1;
    
        return solveMem(0,0,n,m, text1, text2,dp);
    }
    
   public  int solveMem(int i, int j, int n, int m, String a , String b, int[][] dp){
        if(i==n || j==m) return 0;

        if(dp[i][j]!=-1){ 
            return dp[i][j];
        }

        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            ans=Math.max(ans,1 + solveMem(i+1,j+1,n,m,a,b,dp));
        }
        else{
            ans=Math.max(ans, Math.max(solveMem(i,j+1,n,m,a,b,dp), solveMem(i+1,j,n,m,a,b,dp))) ;
        }
        return dp[i][j]=ans;
    }
}