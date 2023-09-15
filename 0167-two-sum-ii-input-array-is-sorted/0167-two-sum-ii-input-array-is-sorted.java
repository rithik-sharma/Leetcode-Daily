class Solution {
    public int[] twoSum(int[] nums, int target) {
       int start = 0;
        int end = nums.length - 1;
        
        while( nums[start] + nums[end] != target){
            if(nums[start] + nums[end] < target){
                start++;
            }else{
                end--;
            }
        }
        
        return new int[] {start+1, end+1};
    }
}