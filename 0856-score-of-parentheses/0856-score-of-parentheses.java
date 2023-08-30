class Solution {
    public int scoreOfParentheses(String s) {
       ArrayDeque<Integer> st = new ArrayDeque<>();
        int score = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(score);
                score = 0;
            }else{
                score = st.peek() + Math.max(2*score , 1);
                st.pop();
            }
        }
        return score;
    }
}