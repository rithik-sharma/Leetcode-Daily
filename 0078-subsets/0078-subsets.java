class Solution {
   public List<List<Integer>> subsets(int[] arr){  
       int n = arr.length;
    List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
       solve(arr,res,0,n,cur);
       
       return res;
   }

    public static void solve(int[] arr,List<List<Integer>> res, int i, int n,List<Integer> cur){
       
        if(i == n){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        cur.add(arr[i]);
        solve(arr, res, i+1, n, cur);
        cur.remove(cur.size() - 1);
        solve(arr, res, i+1, n, cur);
    }
              
 }

// TC = O(n*2^n)
// Sc = o(n*2^n)