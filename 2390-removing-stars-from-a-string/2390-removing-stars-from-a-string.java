class Solution {
    public String removeStars(String s) {
        Stack<Character> stack =new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        StringBuffer ans = new StringBuffer();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}