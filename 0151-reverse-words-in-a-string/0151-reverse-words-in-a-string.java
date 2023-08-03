class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words = s.split(" ");
        
        int left = 0;
        int right = words.length - 1;
        while( left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
             
        }
        
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            if(!word.isEmpty())
            ans.append(word).append(" ");
        }
        
        
        return ans.toString().trim();
    }
}