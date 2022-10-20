class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
           int indexDouble = binary(arr , arr[i] * 2);
            if(indexDouble != i && indexDouble != -1){     
                return true;
            } 
        }
        return false;
    }
    int binary(int[] arr , int key){
        int s = 0;
        int e = arr.length - 1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(key == arr[m]) 
                return m;
            if(key > arr[m]) 
                s = m + 1;
            else
                e = m - 1; 
        }
        return -1;
    }
}