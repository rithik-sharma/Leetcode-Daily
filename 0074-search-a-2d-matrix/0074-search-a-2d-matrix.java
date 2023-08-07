class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length; //row - 3
        int col = matrix[0].length;//column - 4
        int low = 0;
        int high = row*col - 1; 
        // from 0 - 11
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(matrix[mid/col][mid%col] == target){
                return true;
            }else if(matrix[mid/col][mid%col] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        
       return false;
    }
}