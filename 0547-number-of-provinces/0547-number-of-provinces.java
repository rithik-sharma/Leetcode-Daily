class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int vis[] = new int[n];
        int count = 0;
        
        for(int i = 0; i < n ;i++){
            if(vis[i] == 0){
                count++;
                dfs(M,i,vis);
            }
        }
      return count;  
    }
    
    
    private void dfs(int[][]M,int i, int vis[]){
        for(int j = 0 ; j < M[i].length ; j++){
            if(vis[j] == 0 && M[i][j] != 0){
                vis[j] = 1;
                dfs(M,j,vis);
            }
        }
    }
    
}