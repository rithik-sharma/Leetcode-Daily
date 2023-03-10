class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<piles.length; i++){
            pq.offer(piles[i]);
        }
        
        while(k>0){
            int op = pq.remove();
            int ip =0;
            if(op%2 == 0){
                ip = op/2;
                pq.offer(ip);
            }else{
                ip = (op/2)+1;
                pq.offer(ip);
            }
            
            k--;
        }
        int ans = 0;
        while(pq.size() > 0){
            ans = ans + pq.remove();
        }
        
        return ans;
    }
}