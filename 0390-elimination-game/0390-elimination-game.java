class Solution {
    public int lastRemaining(int n) {
        boolean isLeft = true;
        int remaining = n;
        int start = 1;      
        int jump = 1;
        
        while(remaining > 1){
            if(isLeft || (remaining % 2 != 0)){     
                start += jump;
            }
            
            remaining = remaining / 2;
            jump = jump * 2;
            isLeft = !isLeft;
        }
        return start;
    }
    
}
    