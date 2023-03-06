class Solution {
    public int[] intersect(int[] a, int[] b) {
    HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int i =0;  i<a.length; i++){
            if(fmap.containsKey(a[i])){
                int of = fmap.get(a[i]);
                int nf = of+1;
                fmap.put(a[i] , nf);
            }else{
                fmap.put(a[i] , 1);
            }
        }
        
        ArrayList<Integer> box = new ArrayList<>();
        
        for(int val: b){
            if(fmap.containsKey(val) && fmap.get(val) > 0){
                box.add(val);
                int of = fmap.get(val);
                int nf = of-1;
                fmap.put(val , nf);
            }
        }
        
        int[] arr = new int[box.size()];
        int index =0;
        for(int i : box){
            arr[index++] = i;
        }
        
        return arr;
    }
}