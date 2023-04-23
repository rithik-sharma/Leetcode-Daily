class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // form a graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        int m = prerequisites.length;
        for(int i = 0; i<m; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int indegree[] = new int[numCourses];
        for(int i =0; i<numCourses; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i =0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        
        // List<Integer> topo = new ArrayList<Integer>();
        int[] topo = new int[numCourses];
        int k =0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            // topo.add(node);
            topo[k++] = node;
            
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
       if(k == numCourses ){
           return topo;
       } 
        
        int[] arr = {};
        return arr;
    }
}