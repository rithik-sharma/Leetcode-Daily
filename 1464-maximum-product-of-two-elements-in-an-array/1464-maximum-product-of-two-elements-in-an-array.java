class Solution {
   public int maxProduct(int[] nums) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //max-heap
    for(int n:nums) pq.offer(n);
    
    int max1=pq.poll();    //first max element in array
    int max2=pq.poll();    //second max element in array
  
    return (max1-1)*(max2-1);
}
}