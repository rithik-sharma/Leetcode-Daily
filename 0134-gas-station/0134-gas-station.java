class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int n = gas.length;
        int start = 0;
        int cur = 0;
        int prev = 0;
        
        for(int i = 0; i<n; i++){
            cur = cur + gas[i] - cost[i];
            if(cur < 0){
                prev = prev + cur;
                cur = 0;
                start = i+1;
            }
        }
        if(cur + prev >=0) return start;
        return -1;
  }
}