class Solution {
    public boolean validPalindrome(String s) {
        int i  = 0; 
        int j = s.length() - 1;
        
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return checkPalindrome(s , i+1 , j) || checkPalindrome(s , i , j-1);
            }
        }
        
        return true;
    }
    
    
    public boolean checkPalindrome(String s , int start , int end){
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        
        return true;
    }
}