// class Solution {
//     public int arraySign(int[] nums) {
//         double product = 1;
//         for(int i =0; i<nums.length; i++){
//             product = product * nums[i];
//         }
        
//         if(product > 0){
//             return 1;
//         }else if(product < 0){
//             return -1;
//         }
       
//         return 0;
//     }
// }


// second approach
class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
             return 0;
          }
          if(nums[i]<0){
             c++;
          }
        }
        
        if(c%2 == 0){
            return 1;
        }else
            return -1;
        // return c%2==0 ? 1:-1;
    }
}