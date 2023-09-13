class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
           map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int ans = 0;
        for(int num : nums){
           if(map.get(num) == 1){
               ans = ans + num;
           } 
        }
        
        return ans;
    }
}