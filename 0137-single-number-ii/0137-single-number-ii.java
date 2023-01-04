class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new<Integer, Integer> HashMap();
        
        for(int x : nums){
            if(hash.containsKey(x)){       
                int count = hash.get(x);
                hash.put(x, ++count);
            }
            else
                hash.put(x, 1);          
        }
        
        for(int x : hash.keySet()){       
            if(hash.get(x)==1)            
                return x;
        }
        
        return -1;
    }
}