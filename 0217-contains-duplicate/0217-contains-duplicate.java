class Solution {
    public boolean containsDuplicate(int[] nums) {
       if(nums.length == 0)
           return false;
        
        HashSet<Integer> set = new HashSet<>();
        for(int e : nums){
            if(!set.add(e)){
                return true;
            }
        }
        
        return false;
    }
}