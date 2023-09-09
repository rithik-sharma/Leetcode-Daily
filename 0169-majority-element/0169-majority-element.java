class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ansIndex = nums.length/2;
        
        return nums[ansIndex];
    }
}