class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i =0, j =0; i<pushed.length; i++){
            stack.push(pushed[i]);
            while(stack.size() > 0 && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.size() == 0;
    }
}