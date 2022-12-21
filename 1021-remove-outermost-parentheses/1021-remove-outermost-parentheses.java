class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='(' && count==0){
                count++;
            }else if(s.charAt(i)=='(' && count>0){
                ans.append("(");
                count++;
            }else if(s.charAt(i)==')' && count>1){
                ans.append(")");
                count--;
            }else{
                count--;
            }
        }
        String ans1 = new String(ans);
        return ans1;
    }
}