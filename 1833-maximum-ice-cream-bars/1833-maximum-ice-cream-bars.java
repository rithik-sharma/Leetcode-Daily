class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
         int k =0;
        if(coins < costs[k]) return 0;
        int ans = 0;
        
        for(int i =0; i<costs.length; i++){
            if(coins >= costs[i]){
              coins = coins - costs[i];
                
                ans++;
            }
            
        }
       return ans;
    }
}