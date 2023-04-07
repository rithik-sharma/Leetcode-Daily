//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
          public static void dfs(int node , ArrayList<ArrayList<Integer>> adjList , int vis[]){
            vis[node] = 1;
            for(Integer it : adjList.get(node)){
                if(vis[it] == 0){
                    dfs(it , adjList , vis);
                }
            }
        }
        
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here
  
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<Integer>());
        }
        
        // to change adjacency matrix to list
        for(int i = 0; i < v; i++){
            for(int j =0; j<v; j++){
                if(adj.get(i).get(j) == 1 && i != j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        
        int vis[] = new int[v];
        int count = 0;
        for(int i =0; i<v; i++){
            if(vis[i] == 0){
                count ++;
                dfs(i,adjList, vis);
            }
        }
        
        return count;
    }
};