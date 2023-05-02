class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count =0;
        int curSum = 0;
        int n = arr.length;
        
        for(int i = 0; i<k;i++){
            curSum += arr[i];
        }
        if(curSum/k >= threshold){
                count++;
          }
        
        int left =0;
        for(int i = k; i < n; i++){
            curSum -= arr[left];
            curSum += arr[i];
            
            if(curSum/k >= threshold){
                count++;
            }
            
            left++;
        }
        
        return count;
    }
}