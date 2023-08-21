class Solution {
    public long[] getDistances(int[] nums) {
      int n = nums.length;
        long[] ans = new long[n];
        Map<Integer , List<Integer>> map = new HashMap<>();
        
        for(int i =0; i<n; i++){
            int curr = nums[i];
            if(!map.containsKey(curr)){
                map.put(curr , new ArrayList<>());
            }
            
            map.get(curr).add(i);
        }
        
        for(Integer key : map.keySet()){
            int curVal = key;
            List<Integer> indices = map.get(curVal);
            if(indices.size() == 1){
                ans[indices.get(0)] = 0;
                continue;
            }
            
            
          n = indices.size();
            long sum = 0;
            for(int i =0; i<n;i++){
                sum = sum + indices.get(i);
            }
            
            long leftSum = 0;
            long rightSum = sum;
            long currAns = 0;
            for(int i =0; i<n; i++){
               currAns = 0;
                currAns = currAns + (long)i*(long)indices.get(i) - leftSum;
                currAns = currAns + rightSum - (long)(n-i)*(long)indices.get(i);
                leftSum = leftSum + (long)indices.get(i);
                rightSum = rightSum - (long)indices.get(i);
                ans[indices.get(i)] = currAns;
            }
        }
        
        return ans;  
    }
}