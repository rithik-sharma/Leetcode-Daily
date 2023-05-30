// class Solution {
// public void setZeroes(int[][] matrix) {
// --------------------------     Brute force solution    ----------------------------
        
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
        
        
        
//  ------------------------       BETTER SOOLUTION :-      ------------------------------

//  class Solution {
//     public void setZeroes(int[][] matrix) {
// //     row
//         int n = matrix.length;
// //     col
//         int m = matrix[0].length;
        
//         int[] arrRow = new int[n];
//         int[] arrCol = new int[m];
        
//         for(int i =0; i<n; i++){
//             for(int j =0; j<m; j++){
//                 if(matrix[i][j] == 0){
//                     arrRow[i] = 1;
//                     arrCol[j] = 1;
//                 }
//             }
//         }
        
//         for(int i =0; i<n; i++){
//             for(int j =0; j<m; j++){
//                 if(arrRow[i] == 1 || arrCol[j] == 1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
    
    
//      }
//  }
// Discuss Time Complexity :-
// we are just itrating 2 time n*m and thus the tc would be O(n^2) time approx...
// but here we take some space O(m+n)


//-------------------------       Optimal Solution :-       ----------------------------

 class Solution {
    public void setZeroes(int[][] matrix) {
        //     row
        int n = matrix.length;
        //     col
        int m = matrix[0].length;
        
        int col0 = 1;
     for(int i =0; i<n; i++){
        for(int j =0; j<m;j++){
            if(matrix[i][j] == 0){
                // mark the ith row
                matrix[i][0] = 0;
                // mark the jth col
                if(j != 0){
                    matrix[0][j] = 0;
                }else{
                    col0 = 0;
                }
            }
        }
      }
        
        for(int i =1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(matrix[i][j] != 0){
                    // check for col & row
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                    
                }
            }
        }
        
        if(matrix[0][0] == 0){
            for(int j =0; j<m; j++) matrix[0][j] = 0;
        }
        
        if(col0 == 0){
            for(int i =0; i<n; i++) matrix[i][0] = 0; 
        }
    
     }
 }
        
        
        
        
    
    
    
