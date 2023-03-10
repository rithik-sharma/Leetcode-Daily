//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}


// } Driver Code Ends


class Solution
{
    private static PriorityQueue<Integer> min;
    private static PriorityQueue<Integer> max;
    
    public Solution(){
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public static void insertHeap(int x)
    {
        max.offer(x);
        min.offer(max.poll());
        if(max.size() < min.size()){
            max.offer(min.poll());
        }
    }
    
    
    // public static void balanceHeaps()
    // {
    //   if(max.size() > min.size() +1){
    //       min.add(max.poll());
    //   }
    //   else if(min.size() > max.size()){
    //         max.add(min.poll());
    //   }
    // }
    
  
    public static double getMedian()
    {
        if(max.size() == min.size())
            return (max.peek() + min.peek())/2.0;
        else
            return max.peek();
    }
    
}