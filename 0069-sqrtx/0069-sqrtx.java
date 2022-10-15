public class Solution {

    int mySqrt(int x) {
        int left=1, right=x,ans=0;
        if(x==0){
            return 0;
        }
        while(left <= right){
            int mid= left + (right-left)/2;
            
            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                right=mid-1;
            }
            else{
                ans=mid;
                left=mid+1;
            }
        }
        return ans;
    }
};