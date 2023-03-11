class Solution {
    public long maxKelements(int[] nums, int k) {
       long score =0;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int l : nums){
            pq.add(l);
        }
        
        while(k > 0){
            int rm = pq.remove();
            score = score + rm;
            double addNum = Math.ceil(rm/3.0);
            pq.add((int)addNum);
            k--;
        }
        
       
        return score;
    }
}