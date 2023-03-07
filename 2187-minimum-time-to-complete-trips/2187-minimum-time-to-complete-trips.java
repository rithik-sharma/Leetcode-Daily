class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long max = -1;
        for(int i =0; i<time.length; i++){
            max = Math.max(max,time[i]);
        }
        
        long low = 1;
        long high = max*totalTrips;
        
  while(low<=high){
              long mid=low+(high-low)/2;
              long sum=0;
           for(int i=0;i<time.length;i++){
               sum+=(mid/time[i]);
               if(sum>=totalTrips){
                   break;
               }
           }
           if(sum>=totalTrips) high=mid-1;
           else low=mid+1;
         
       }
        return low;

    }
}