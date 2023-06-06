class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean ans = true;
        int diff = 0;
        if(arr.length < 2){
            return true;
        }else{
           diff = arr[1] - arr[0];
        }
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i] - arr[i-1] == diff){
                ans = true;
            }else{
                ans = false;
                break;
            }
        }
        
        return ans;
    }
}