class Solution {
    public int strStr(String h, String n) {
        int x = h.length()- n.length();
        for(int i=0;i<=x;i++){
            if(h.charAt(i) == n.charAt(0)){
                if(h.substring(i, i + n.length()).equals(n)){
                    return i;
                }
            }
        }
        return -1;
    }
}