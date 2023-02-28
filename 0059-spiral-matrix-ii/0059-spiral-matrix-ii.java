class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int minr = 0;
        int minc = 0;
        int maxr = ans.length -1;
        int maxc = ans[0].length - 1;
         int totalNoElement = ans.length*ans[0].length;
        int count = 0;
        int m =1;
        while(count< totalNoElement){
            //top wall
            for(int i= minc; i<= maxc && count< totalNoElement; i++ ){
               ans[minr][i] = m;
                count++;
                m++;
            }
            minr++;
            
            // right wall
             for(int i= minr; i<= maxr && count< totalNoElement; i++ ){
               ans[i][maxc] = m;
                 count++;
                 m++;
            }
            maxc--;
            
            //bottom wall
             for(int i = maxc; i>= minc && count< totalNoElement; i--){
                ans[maxr][i] = m;
                 count++;
                 m++;
            }
            maxr--;
            
            //left wall
            for(int i = maxr;i >= minr && count< totalNoElement; i--){
                ans[i][minc] = m;
                count++;
                m++;
            }
            minc++;
         
        }
        return ans;
    }
}