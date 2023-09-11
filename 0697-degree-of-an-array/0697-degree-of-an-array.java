class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        Map<Integer, Integer> count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}





// Dry Run for this test case:-
// [1,2,2,3,1,3,3,4,2]

// x = 1;
// left = 1,0
// right = 1,0
// count = 1,1
    
// x = 2;
// left = 1,0   2,1  3,3  4,7 
// right = 1,4  2,8  3,6
// count = 1,2   2,3   3,3  4,1   
    
    
    
// ans = 9;
// degree = 3;

// for (int x: count.keySet()) {
//     if (count.get(x) == degree) {
//         ans = Math.min(ans, right.get(x) - left.get(x) + 1);
//     }
// }

// int x = 2;
// ans = Math.min(ans , 8 - 1 + 1);          ans = 8;

// int x = 3;
// ans = Math.min(ans , 6 - 3 + 1);          ans = 4;


// ans = 4;