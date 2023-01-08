class Solution {
    public String getHint(String secret, String guess) {
        int bulls =0;
        int cows = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i =0; i<secret.length(); i++ ){
            map1.put(secret.charAt(i), map1.getOrDefault(secret.charAt(i), 0) + 1);
            map2.put(guess.charAt(i), map2.getOrDefault(guess.charAt(i), 0) + 1);
           if(secret.charAt(i) == guess.charAt(i)) {
               bulls++;
        }
    }
        
        for(char c : map1.keySet()){
            if(map2.containsKey(c)){
                cows = cows + Math.min(map1.get(c), map2.get(c));
            }
        }
        
        cows = cows - bulls;
        String s = bulls + "A" + cows + "B";
        return s;
    }
}