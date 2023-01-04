class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int x : tasks){
            if(hash.containsKey(x)){
                int count = hash.get(x);
                hash.put(x, ++count);
            } else
                hash.put(x, 1);
        }
    int ans =0;
       for(int x : hash.keySet()){
            if(hash.get(x)==1)return -1;
            else{
                ans += hash.get(x)/3;
                if(hash.get(x)%3 !=0)
                ans++;  
            }
       }
        return ans; 
    }
}