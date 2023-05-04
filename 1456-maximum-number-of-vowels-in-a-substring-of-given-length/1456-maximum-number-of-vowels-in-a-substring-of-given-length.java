class Solution {
    public int maxVowels(String s, int k) {
        int window = 0;
        int result =0;
        // Example : abciiidef
        // for first abc window = 1
        for(int i = 0; i<k;i++){
            window += isVowel(s.charAt(i));
        }
        
        result = window;
        int left =0;
        for(int i = k; i<s.length(); i++){
            window -= isVowel(s.charAt(left));
            window += isVowel(s.charAt(i));
            result = Math.max(result , window);
            left++;
        }
        return result;
    }
    
    private int isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}