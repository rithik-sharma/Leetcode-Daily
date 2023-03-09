class Solution {
    public int lastStoneWeight(int[] stones) {
        int ans =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<stones.length; i++){
            pq.add(stones[i]);
        }
      
        if(pq.size() == 2){
            return pq.remove() - pq.remove();
        }
        
        while(pq.size() >= 2){
           int y = pq.remove();
           int x = pq.remove();
        if(x != y){
          ans = y-x;
            pq.add(ans);
        }else {
            ans = 0;
        }
       }
            if(pq.size() == 1){
            return pq.remove();
        }
        
        
        return ans;
    }
}