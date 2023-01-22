class Solution {
    public static boolean isPalindrome(String s){
        int i =0, j= s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
              return false;   
            }
            i++;
            j--;
        }
        
        return true;
    }
    public int removePalindromeSub(String s) {
        boolean res = isPalindrome(s);
         
        if(res) return 1;
        return 2;
    }
}