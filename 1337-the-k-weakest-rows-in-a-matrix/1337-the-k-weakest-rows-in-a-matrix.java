class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        
        int[] count = new int[rowLen];
        int[] ans = new int[k];
        
        for (int i = 0; i < rowLen; i++) {
            int soldiers = 0;
            for (int j = 0; j < colLen; j++) {
                if (mat[i][j] == 1) {
                    soldiers++;
                }
                else {
                    break;
                }
            }
            count[i] = soldiers * 1000 + i;
        }
        Arrays.sort(count);
        
        for (int i = 0; i < k ; i++) {
            ans[i] = count[i] % 1000;
        }
        return ans;
    }
}