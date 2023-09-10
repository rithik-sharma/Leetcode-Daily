class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       int totalSum = n*(n+1)/2;
        
        int currentTotal = 0;
        for(int num : nums){
            currentTotal += num;
        }
        
        return totalSum - currentTotal;
    }
}