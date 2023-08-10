class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = s.length();
        int matchingLength = solve(s,t,0,0);
        
        if(len == matchingLength){
            return true;
        }else{
            return false;
        }
    }
    
    static int solve(String s , String t , int i , int j){
        if(j >= t.length() || i >= s.length()){
            return 0;
        }
        
        if(s.charAt(i) == t.charAt(j)){
            return 1 + solve(s,t,i+1,j+1);
        }else{
            return  solve(s,t,i,j+1);
        }
    }
}