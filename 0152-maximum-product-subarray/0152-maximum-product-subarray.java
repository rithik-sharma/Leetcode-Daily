class Solution {
    public int maxProduct(int[] n) {
        int prefix =1;
        int suffix =1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n.length;i++){
           
            if(prefix ==0)prefix=1;
            if(suffix==0)suffix=1;
             prefix *= n[i];
            suffix *= n[n.length-1-i];

            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
        
    }
}

// Intuition

// Imagine if all the no are positive, than we are going to multiply all the no for maximum subarray
// Imagine if there are even negative no, then also we are going to multiply the all the no to get the maximum subarray
// Now imagine if there are odd negative no now we cannot multiply all the no now we have to decide which no we have to ignore for getting the maximum subarray.
// Now if I observe whenever i decide to ignore a negative no then there is always going to be suffix and prefix as a answer