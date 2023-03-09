class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) +1);
        }
        
        ArrayList<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs);
        Collections.reverse(freqs);
        // Collections.sort(freqs,Collections.reverseOrder());
        
        int count = 0;
        int totalEl = n;
        int i =0;
        while(totalEl > n/2){
            totalEl = totalEl - freqs.get(i);
            i++;
            count++;
        }
        
        return count;
    }
}