class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new<Integer, Integer> HashMap();
        int[] ans = new int[2];
        for(int x : nums){
            if(hash.containsKey(x)){       
                int count = hash.get(x);
                hash.put(x, ++count);
            }
            else
                hash.put(x, 1);          
        }
        int i =0;
        for(int x : hash.keySet()){       
            if(hash.get(x)==1) {           
               ans[i] = x; 
            i++;
            }
        }
        
        return ans;
    }
}