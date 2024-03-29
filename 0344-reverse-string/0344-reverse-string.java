class Solution {
    public void reverseString(char[] s) {
     solve(s, 0 , s.length-1);
    
    }
    
    static void solve(char[] s, int start, int end){
        if(start >= end) return;
        swap(s, start, end);
        solve(s, ++start, --end);
    }
    
    static void swap(char[] s , int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}