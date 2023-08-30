// class Solution {
//     public int scoreOfParentheses(String s) {
//        ArrayDeque<Integer> st = new ArrayDeque<>();
//         int score = 0;
//         for(int i =0; i<s.length(); i++){
//             if(s.charAt(i) == '('){
//                 st.push(score);
//                 score = 0;
//             }else{
//                 score = st.peek() + Math.max(2*score , 1);
//                 st.pop();
//             }
//         }
//         return score;
//     }
// }


class Solution {
    public int scoreOfParentheses(String s) {
       int depth = 0;
       int res =0;
        char prev = '(';
        
        for(char ch : s.toCharArray()){
            if(ch == '(')
                depth++;
            else{
                depth--;
                if(prev == '('){
                    res = res + (int)Math.pow(2,depth);
                }
            }
             prev = ch;
        }
        return res;
    }
}