class Solution {
    public boolean searchMatrix(int[][] a, int key) {
        int n = a.length;
        int m = a[0].length;
        int i =0;
        int j = m-1;
        while(i<n && j>=0){
            if(a[i][j] == key){
                return true;
            }else if(key > a[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}