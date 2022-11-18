class Solution {
    public int findPeakElement(int[] a) {
        int start =0;
        int end = a.length-1;
        int ans = -1;
        
        while(start <= end){
            int mid = start+(end-start)/2;
            
            if(a.length == 1){
                return 0;
            }
            
            if(mid>0 && mid<end){
                if(a[mid] > a[mid-1] && a[mid] > a[mid+1]){
                    ans = mid;
                    return ans;
                }else if(a[mid-1] > a[mid]){
                    end= mid-1;
                }else{
                    start = mid +1;
                }
            }else if(mid == 0){
                if(a[0] > a[1]){
                    ans = 0;
                    return ans;
                }else{
                    ans = 1;
                    return ans;
                }
            }else if(mid == end){
                if(a[end] > a[end-1]){
                return end;
                }else{
                    return end-1;
                }
                
            }
        }
        
        return ans;
    }
}