class Solution {
    public String reverseWords(String s) {
    String g = removeExtraSpace(s);
       char[] c = g.toCharArray();
        int n = c.length;
        
        reverseChar(c , 0 , n-1);
        reverseWords(c);
       
       return new String(c).trim(); 
    }
    
    static void reverseChar(char[] c , int i , int j){
        while(i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    
    static void reverseWords(char[] c){
        int start = 0;
        int end = 0;
        for(; end < c.length; end++){
            if(c[end] == ' '){
                reverseChar(c , start , end -1);
                start = end + 1;
            }
        }
        reverseChar(c, start , end-1);
    }
    
    
    static String removeExtraSpace(String s){
        StringBuilder result = new StringBuilder();
        boolean spaceEncounter = false;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                if(!spaceEncounter){
                    result.append(c);
                    spaceEncounter = true;
                }
            }else{
                result.append(c);
                spaceEncounter = false;
            }
        }
        
        return result.toString();
    }
}