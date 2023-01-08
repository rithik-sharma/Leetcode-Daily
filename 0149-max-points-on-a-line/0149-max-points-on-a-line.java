class Solution {
    public int maxPoints(int[][] points) {
        // slope of line is angle made by the line with x axis.
        // formula: slope = (y2-y1)/(x2-x1)
        int n = points.length;
        if(n<3){
            return n;
        }
        
        int maxNumPointsOnSameLine = 2;
        
        for(int i =0; i<n-1; i++){
            Map<String , Integer> slopeCount = new HashMap<>();
            for(int j = i+1; j<n; j++){
                String slope = getSlope(points[i] , points[j]);
                slopeCount.put(slope , slopeCount.getOrDefault(slope, 0)+1);
            }
            
            for(String slope : slopeCount.keySet()){
                maxNumPointsOnSameLine = Math.max(maxNumPointsOnSameLine , slopeCount.get(slope) + 1);
            }
        }
        
        return maxNumPointsOnSameLine;
    }
    
    private int gcd(int x, int y ){
        return y == 0 ? x : gcd(y, x % y);
    }
    
    private String getSlope(int[] p1 , int[] p2){
        int x = p1[0] - p2[0];
        int y = p1[1] - p2[1];
        
        int gcd = gcd(x,y);
        x = (gcd == 0 ? x/Math.max(x,y): x/gcd);
        y = (gcd == 0 ? y/Math.max(x,y): y/gcd);
        
        return " " + x + "_" + y;
    }
}