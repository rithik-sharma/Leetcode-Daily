class Solution {
    public int[] intersect(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        int k =0;
        int[] arr = new int[ans.size()];
        for(int e: ans){
            arr[k++] = e;
        }
        
        return arr;
    }
}