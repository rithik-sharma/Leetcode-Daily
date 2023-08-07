class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; //row
        int m = matrix[0].length;//column
        int i = 0;
        int j = m-1;
        
        while(i<n && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
        
        return false;
    }
}