class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int ans = 0;
        
        while(low <= high){
            int mid = low + (high - low)/2;
             ans = nums[mid];
            if(low == high){
                return ans;
            }
            
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
    
        }
        
        return ans;
    }
}