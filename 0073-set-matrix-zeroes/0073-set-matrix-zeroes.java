class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute force solution
        //col
        int m = matrix[0].length;
        //row
        int n = matrix.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                  markRow(matrix,i,m);
                  markCol(matrix,j,n);  
                } 
            }
        }
        
         for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == -4){
                    matrix[i][j] = 0;
                } 
            }
        }
       
    }
    
    public void markRow(int[][] matrix,int i , int m){
        for(int j =0; j<m; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -4;
            }
        }
    }
    
      public void markCol(int[][] matrix,int j , int n){
        for(int i =0; i<n; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -4;
            }
        }
    }
    
    
    
}