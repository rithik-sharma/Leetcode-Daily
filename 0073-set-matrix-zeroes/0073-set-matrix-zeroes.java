// class Solution {
// public void setZeroes(int[][] matrix) {
      // Brute force solution
        
//         //col
//         int m = matrix[0].length;
//         //row
//         int n = matrix.length;
//         for(int i =0; i<n; i++){
//             for(int j =0; j<m; j++){
//                 if(matrix[i][j] == 0){
//                   markRow(matrix,i,m);
//                   markCol(matrix,j,n);  
//                 } 
//             }
//         }
        
//          for(int i =0; i<n; i++){
//             for(int j =0; j<m; j++){
//                 if(matrix[i][j] == -4){
//                     matrix[i][j] = 0;
//                 } 
//             }
//         }
       
//     }
    
//     public void markRow(int[][] matrix,int i , int m){
//         for(int j =0; j<m; j++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -4;
//             }
//         }
//     }
    
//       public void markCol(int[][] matrix,int j , int n){
//         for(int i =0; i<n; i++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -4;
//             }
//         }
//     }

        
//         Here, i just take -4 this value should be just somthing different.
//         Here's the time complexity is 
//         first nested loops n*m inside it n+m, so we can write it like (n*m) * (n+m)
//         And then at last we itrate over the matrix again n*m.
//         so the tc becomes (n*m) * (n+m) + n*m  so it become someWhat  ~  O(n^3)
        
        
        
//         BETTER SOOLUTION :-

 class Solution {
    public void setZeroes(int[][] matrix) {
//     row
        int n = matrix.length;
//     col
        int m = matrix[0].length;
        
        int[] arrRow = new int[n];
        int[] arrCol = new int[m];
        
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                    arrRow[i] = 1;
                    arrCol[j] = 1;
                }
            }
        }
        
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arrRow[i] == 1 || arrCol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    
    
    
     }
 }
        
        
        
        
    
    
    
