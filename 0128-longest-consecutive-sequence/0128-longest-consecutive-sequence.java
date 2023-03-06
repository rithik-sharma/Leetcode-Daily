class Solution {
    public int longestConsecutive(int[] nums) {
    HashMap<Integer, Boolean> map  = new HashMap<>();
        for(int val : nums){
            map.put(val, true);
        }
        
        for(int val : nums){
            if(map.containsKey(val -1)){
                map.put(val, false);
            }
        }
        
        int maxStartingPoint = 0;
        int maxLength = 0;
        
        for(int val : nums){
            if(map.get(val) == true){
                int temporaryLength = 1;
                int temporaryStartingPoint = val;
                while(map.containsKey(temporaryStartingPoint + temporaryLength)){
                    temporaryLength++;
                }
                
                if( temporaryLength > maxLength){
                    maxLength = temporaryLength;
                }

            }
        }
        
  return maxLength;
        
    }
}