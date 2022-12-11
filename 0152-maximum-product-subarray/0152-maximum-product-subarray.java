class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;
     for(int i =0; i<n; i++){
         int product = 1;
         for(int j =i; j<n; j++){
             product = product*nums[j];
             maxProduct = Math.max(maxProduct,product);
         }
     }
        
        return maxProduct;
    }
}