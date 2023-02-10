class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i] - nums[0];
        }
        
        return sum;
    }
}