class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0; i<nums.length; i++){
            int comp = k - nums[i];
            if(map.containsKey(comp)){
                count++;
                map.put(comp , map.get(comp) - 1);
                 if(map.get(comp)==0)
                    map.remove(comp);
                continue;
            }
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);  
        
            
        }
        
        return count;
    }
}