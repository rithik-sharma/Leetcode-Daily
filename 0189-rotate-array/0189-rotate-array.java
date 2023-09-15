// TC = o(n)
// SC = O(n)

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         int[] arr = new int[n];
//         int j =0;
//         for(int i = n-k; i<n; i++){
//             arr[j] = nums[i];
//             j++;
//         }
        
//         for(int i =0; i<n-k; i++){
//             arr[j] = nums[i];
//             j++;
//         }
        
//         for(int i =0; i<n; i++){
//             nums[i] = arr[i];
//         }
//     }
// }



// SECOND APPROACH

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        reverse(nums, 0 , n-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k , n-1);
        
    }
    
    public static void reverse(int[] nums, int start , int end){
        while(start < end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
            start++;
            end--;
        }
    }
}
