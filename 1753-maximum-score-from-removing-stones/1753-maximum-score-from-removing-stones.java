class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int count=0;
        while(true){
            int first=pq.poll();
            int second=pq.poll();
            if(second==0){
                break;
            }
            count++;
            pq.add(first-1);
            pq.add(second-1);
        }
        return count;
    }
}