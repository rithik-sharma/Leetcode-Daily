class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[0] > k) return k;
        int num = k;
        for(int a: arr){
            if(a <= num){
                num++;
            }else{
                break;
            }
        }
        
        return num;
    }
}