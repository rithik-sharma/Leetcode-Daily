class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
         int ret =0;
         List<Integer> answer =new ArrayList();
        for(int num : nums){
           if(!myMap.containsKey(num)){
               myMap.put(num,1);
           }else{
               myMap.put(num, myMap.get(num)+1);
           }

           if(myMap.get(num) > nums.length/3){
               if(!answer.contains(num))
               answer.add(num);
           }
       }
       return answer;
    }
}