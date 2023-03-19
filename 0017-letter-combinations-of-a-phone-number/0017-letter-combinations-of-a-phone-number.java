class Solution {
    public List<String> letterCombinations(String digits) {
        
         if(digits.length() == 0){
            List<String> bres = new ArrayList<>();
            // bres.add("");
            return bres;
        }else{
            List<String> ans =  helper( digits);
             return ans;
         }
        
        
         
    }
    
    public List<String> helper(String digits)  {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length() == 0){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = digits.charAt(0);
        String ros = digits.substring(1);
        
        List<String> rres = helper(ros);
        List<String> mres = new ArrayList<>();
        
        String codeforch = digitletter[ch - '0'];
        for(int i =0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String rstr : rres){
                mres.add(chcode + rstr);
            }
        }
        
        return mres;
    }
}