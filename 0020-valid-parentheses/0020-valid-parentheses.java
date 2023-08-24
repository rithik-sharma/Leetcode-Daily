class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        ArrayDeque<Character> st = new ArrayDeque<>();
        
        for(char i : s.toCharArray()){
            if(st.isEmpty()){
                st.push(i);
            }else if ((st.peek() == '(' && i == ')') || 
                      (st.peek() == '[' && i == ']') || 
                      (st.peek() == '{' && i == '}')) {
                st.pop();
            } else {
                st.push(i);
            }
        }
        
        return st.isEmpty();
    }
}