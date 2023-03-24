class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while(n != 0){
            res = res + n/5;
            n = n/5;
        }
        // for(int i=5;i<=n;i=5*i){
        //     res = res + (n/i);
        // }
        return res;
    }
}