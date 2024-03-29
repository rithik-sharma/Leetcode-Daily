class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0, max = 0;
        for(int weight: weights){
            min = Math.max(min, weight);
            max += weight;
        }
        
        while(min<=max){
            int mid = (min+max)/2;
            if(getDays(weights, mid) <= days)
                max = mid -1;
            else
                min = mid+1;
        }
        return min;
    }
    
    public int getDays(int[] weights, int capacity){
        int days = 0, sum = 0;
        for(int i=0;i<weights.length; i++){
            if(sum+weights[i] > capacity){
                sum = 0;
                days++;
            }
            sum += weights[i];
        }
        if(sum>0) days++;
        return days;
    }
}