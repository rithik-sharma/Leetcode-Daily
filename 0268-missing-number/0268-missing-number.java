class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalExpected = n*(n+1) / 2;
        
        int total = 0;
        for(int num : nums){
            total = total + num;
        }
        
        return totalExpected - total;
    }
}