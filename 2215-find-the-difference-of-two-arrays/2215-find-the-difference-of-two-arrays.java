class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums1.length;
        Set<Integer> Set1 = new HashSet<>();
 
        for (int element : nums1) {
            Set1.add(element);
        }
        
        Set<Integer> Set2 = new HashSet<>();
 
        for (int element : nums2) {
            Set2.add(element);
        }
        
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Set1);
        List<Integer> list2 = new ArrayList<>(Set2);
        
        for(int i : list1){
            if(!Set2.contains(i)){
                arr1.add(i);
            }
        }
        
         for(int i : list2){
            if(!Set1.contains(i)){
                arr2.add(i);
            }
        }
        
        ans.add(arr1);
        ans.add(arr2);
        
        return ans;
    }
}