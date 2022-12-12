class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        
        int leftprod=1;
        for(int i=0;i<nums.length;i++){
                res[i]=leftprod;
                leftprod*=nums[i];
        }
    
        int rightprod=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=rightprod;
            rightprod*=nums[i];
        }
        return res;
    }
}