class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        
        
        int leftProd = 1;
        for(int i =0; i<nums.length; i++){
            left[i] = leftProd;
            leftProd = leftProd * nums[i];
        }
        
        int rightProd = 1;
        for(int i=nums.length-1;i>=0;i--){
            right[i] = rightProd;
            rightProd = rightProd * nums[i];
        }
        
        for(int q=0;q<n;q++){
           ans[q]=left[q]*right[q];
       }
       return ans;
    }
}