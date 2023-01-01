class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String t : tokens){
            // String operators = "+-*/";
            if("+-*/".contains(t)){
                int second = stack.pop();
                int first = stack.pop();
                int eval = calculate(first , second ,t);
                stack.push(eval);
            }else{
                stack.push(Integer.parseInt(t));
            }
        }
        
        return stack.pop();
    }
    
    public static int calculate(int a , int b, String op){
        if("+".equals(op))
            return a+b;
        else if("-".equals(op))
            return a-b;
        else if("*".equals(op))
            return a*b;
        else
            return a/b;
    }
}