class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList();
       List<Integer> row , pre = null;
        
        for(int i =0; i< numRows; i++){
            row = new ArrayList<Integer>();
            for(int j =0; j<=i; j++){
                if(j ==0 || j ==i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = row;
            result.add(row);
        }
        
        return result;
    }
}

// tc of this is O(n^2)
// sc of this is O(n^2)

// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

//   public static long nCr(int n, int r) {
//         long res = 1;

//         // calculating nCr:
//         for (int i = 0; i < r; i++) {
//             res = res * (n - i);
//             res = res / (i + 1);
//         }
//         return res;
//     }



// Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
// n= 5
//  public static long nCr(int n, int r) {
//         long res = 1;

//         // calculating nCr:
//         for (int i = 0; i < r; i++) {
//             res = res * (n - i);
//             res = res / (i + 1);
//         }
//         return res;
//     }

//     public static void pascalTriangle(int n) {
//         // printing the entire row n:
//         for (int c = 1; c <= n; c++) {
//             System.out.print(nCr(n - 1, c - 1) + " ");
//          }
//         System.out.println();
//     }
