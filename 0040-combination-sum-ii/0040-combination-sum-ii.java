class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0,candidates,new ArrayList<>(), subsets, target);
        return subsets;
    }
    
    
    void generateSubsets(int start, int[] candidates , List<Integer> current , List<List<Integer>> subsets,int target){
        if(target == 0){
           subsets.add(new ArrayList(current));
           return;
        }
        
        if(target < 0)return;
        
        for(int i = start; i<candidates.length; i++){
            if(i > start && candidates[i-1] == candidates[i]) continue;
            current.add(candidates[i]);
            generateSubsets(i+1,candidates,current,subsets,target-candidates[i]);
            current.remove(current.size() - 1);
        }
    }
}







