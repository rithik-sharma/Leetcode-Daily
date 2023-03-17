class Solution {
    public boolean search(int[] nums, int key) {
        int l =0 , r = nums.length-1;
        
        while(l <= r){
            int mid = l + (r-l)/2;
            if(key == nums[mid]){return true;}
            
            if(nums[l] < nums[mid]){
                if(key < nums[mid] && key >= nums[l]){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else if(nums[r] > nums[mid]) {
                 if(key > nums[mid] && key <= nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }else {
                if(nums[mid] == nums[l]){
                    l++;
                }else if(nums[mid] == nums[r]){
                    r--;
                }
            }
        }
        return false;
        
    }
}