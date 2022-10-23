class Solution {
    public int findMin(int[] nums) {
        int s= 0;
        int ans =0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
             ans = nums[m];
            if(s == e){
                return ans;
            }
           
            if(nums[m] > nums[e]){
                s = m+1;
            }else{
                e =m;
            }
        }
        
        return ans;
    }
}