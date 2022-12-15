class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int less_than_count = 1;
        int greater_than_count = 1;
        for(int i =0; i<n-1; i++){
            if(nums[i] <= nums[i+1]){
                less_than_count++;
            }
            if(nums[i] >= nums[i+1]){
                greater_than_count++;
            }
        }
        if(less_than_count == n ||greater_than_count == n){
            return true;
        }
        return false;
    }
}