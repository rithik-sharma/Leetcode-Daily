class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length -1;
        int maxc = matrix[0].length - 1;
         int totalNoElement = matrix.length*matrix[0].length;
        int count = 0;
        while(count< totalNoElement){
            //top wall
            for(int i= minc; i<= maxc && count< totalNoElement; i++ ){
               list.add(matrix[minr][i]); 
                count++;
            }
            minr++;
            
            // right wall
             for(int i= minr; i<= maxr && count< totalNoElement; i++ ){
               list.add(matrix[i][maxc]);
                 count++;
            }
            maxc--;
            
            //bottom wall
             for(int i = maxc; i>= minc && count< totalNoElement; i--){
                list.add(matrix[maxr][i]);
                 count++;
            }
            maxr--;
            
            //left wall
            for(int i = maxr;i >= minr && count< totalNoElement; i--){
                list.add(matrix[i][minc]);
                count++;
            }
            minc++;
         
        }
        return list;
    }
    
}