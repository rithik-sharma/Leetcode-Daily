class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for(int i =0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                int[] arr = {i, map.get(comp)};
                return arr;
            }
            map.put(nums[i] , i);
        }
        
       return null;
    }
}