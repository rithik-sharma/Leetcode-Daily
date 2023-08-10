class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                return true;
            }
            
            if(nums[s] < nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }else if(nums[e] > nums[mid]){
                if(target > nums[mid] && target <= nums[e]){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }else{
                if(nums[s] == nums[mid]){
                    s++;
                }else if(nums[e] == nums[mid]){
                    e--;
                }
            }
        }
        
        return false;
    }
}