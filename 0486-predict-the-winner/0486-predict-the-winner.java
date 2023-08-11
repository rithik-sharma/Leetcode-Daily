class Solution {
    int solve(int[] nums , int i , int j){
        if(i > j)
            return 0;
        if(i == j)
            return nums[i];
        
        int op1 = nums[i] + Math.min(solve(nums , i+2 , j) , solve(nums , i+1 , j-1));
        int op2 = nums[j] + Math.min(solve(nums , i , j-2) , solve(nums , i+1 , j-1));
        
        return Math.max(op1 , op2);
    }
    
    public boolean predictTheWinner(int[] nums) {
        int p1_score = solve(nums , 0 , nums.length - 1);
        int totalScore = 0;
        for(int i =0; i<nums.length; i++){
            totalScore = totalScore + nums[i];
        }
        
        int p2_score = totalScore - p1_score;
        
        if(p1_score >= p2_score)
            return true;
        else
            return false;
    }
}