class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int start = 0;
         int end = letters.length-1;
         int ans = 0;
         while(start<=end){
             int mid = start + (end-start)/2;
             if(letters[mid]<=target){
                 start = mid+1;
             }
             else{
                 ans = mid;
                 end = mid-1;
             }
         }
        return letters[ans];
    }
}