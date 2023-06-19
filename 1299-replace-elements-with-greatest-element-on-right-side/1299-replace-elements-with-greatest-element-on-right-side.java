class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length <= 1){
            return new int[] {-1}; 
        }
        int[] ans = new int[arr.length];
        int maxRight = arr[arr.length - 1];
        ans[arr.length - 1] = -1;
      
        for(int i = arr.length - 2; i>=0; i--){
            int temp = arr[i];
            ans[i] = maxRight;
            if(maxRight < temp){
                maxRight = temp;
            }
        }
        
        return ans;
    }
}