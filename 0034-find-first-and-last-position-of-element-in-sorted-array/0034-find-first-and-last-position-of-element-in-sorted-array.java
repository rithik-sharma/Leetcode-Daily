class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = leftOccurance(nums , target);
        arr[1] = rightOccurance(nums , target);
        
        return arr;
    }
    
    static int leftOccurance(int[] nums , int target){
        int l  =0;
        int r = nums.length - 1;
        int firstAns = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                firstAns = mid;
                r = mid -1;
            }
            if(target > nums[mid]) l = mid+1;
            else r = mid -1;
        }
        
        return  firstAns;
    }
    
    static int rightOccurance(int[] nums , int target){
        int l  =0;
        int r = nums.length - 1;
        int lastAns = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
               lastAns = mid;
                l = mid +1;
            }
            else if(target > nums[mid]) l = mid+1;
            else r = mid -1;
        }
        
        return lastAns;
    }
}