class Solution { 
    public int singleNumber(int[] nums) {
       int n = nums.length;
       int ans = 0;                          // XOR operation
       for(int i : nums){                     // A^0 = A
           ans = ans ^ i;                     // A^A = 0  
        }                                                             
       return ans;  
    }
}