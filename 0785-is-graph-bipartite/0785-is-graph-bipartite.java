class Solution {
     private boolean isbfs(int[][] graph,int i,int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i]=1;
        while(!q.isEmpty()){
            Integer node = q.poll();
            for(int it : graph[node]){
                if(color[it]==-1){
                    q.add(it);
                    color[it]=1-color[node];
                }
                else{
                    if(color[it]==color[node]) return false;
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        
        int color[] = new int[v];
        for(int i =0; i<v; i++){
            color[i] = -1;
        }
        
        for(int i = 0; i<v; i++){
            if(color[i] == -1){
                if(isbfs(graph,i,color) == false){
                    return false;
                }
            }
        }
        
        return true;
    }
}