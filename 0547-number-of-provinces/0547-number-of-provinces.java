class Solution {
    public int findCircleNum(int[][] M) {
         int n = M.length;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<n; i++){
            adjList.add(new ArrayList<Integer>());
        }
        
        //adjacency List
        for(int i =0; i<n; i++){
            for(int j =0; j<M[0].length; j++){
                if(M[i][j] == 1 && i != j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
       
        int vis[] = new int[n];
        int count = 0;
        
        for(int i = 0; i < n ;i++){
            if(vis[i] == 0){
                count++;
                dfs(adjList,i,vis);
            }
        }
      return count;  
    }
    
    
    private void dfs(ArrayList<ArrayList<Integer>> adjList,int i, int vis[]){
       vis[i] = 1;
            for(Integer it : adjList.get(i)){
                if(vis[it] == 0){
                    dfs(adjList, it , vis);
                }
        }
    }
    
}