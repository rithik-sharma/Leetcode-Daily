class Solution {
    public int compress(char[] chars) {
        String str = ""+chars[0];
        int counter = 1;
        for(int i = 1 ; i < chars.length ; i++){
            char curr = chars[i];
            char prev = chars[i-1];
            if(curr==prev){
                counter++;
            }else{
                if(counter>1){
                    str+=counter;
                    counter=1;
                }
                str+=curr;
            }
        } 
        if(counter!=1){
            str+=counter;
        }
        
        for(int i = 0 ; i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}