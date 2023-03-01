class Solution {
    public void rotate(int[] nums, int k) {
     int n = nums.length;      
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
          arr[(i+k)%nums.length] = nums[i];
            
        }
        // copy arr into nums
         for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
    
         }
    }
}