class Solution {
    public int strStr(String s, String p) {
        int n=s.length();
        int m=p.length();
        int x=n-m;
        for(int i=0;i<=x;i++){
            if(p.equals(s.substring(i,i+m))){
                return i;
            }
        }
        return -1;
    }
}