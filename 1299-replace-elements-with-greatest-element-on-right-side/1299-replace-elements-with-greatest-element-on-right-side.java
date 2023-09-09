class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n <= 1){
            return new int[] {-1}; 
        }
        
        int maxRight = arr[n - 1];
        arr[n - 1] = -1;
      
        for(int i = n - 2; i>=0; i--){
            int temp = arr[i];
            arr[i] = maxRight;
            if(maxRight < temp){
                maxRight = temp;
            }
        }
        
        return arr;
    }
}