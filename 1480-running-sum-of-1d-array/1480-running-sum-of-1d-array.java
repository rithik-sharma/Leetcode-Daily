class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        int sum=0;
        for(int i =0; i<nums.length; i++){
           
          sum += nums[i];
           arr[i] = sum;
            
        }        
        return arr;
    }
}

// class Solution {
//     public int[] runningSum(int[] nums) {
//         for (int i = 1; i < nums.length; i++) {
//             nums[i] += nums[i - 1];
//         }
//         return nums;
//     }
// }