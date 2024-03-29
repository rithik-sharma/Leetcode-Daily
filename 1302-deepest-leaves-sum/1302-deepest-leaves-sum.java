/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        // BFS Approach
        
        if(root == null) return root.val;
        
        int sum =0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isDeepest = true;
            sum =0;
            
            for(int i =0; i<size; i++){
                TreeNode cur = queue.poll();
                if(cur.left == null && cur.right == null){
                    sum += cur.val;
                }
                
                if(cur.left != null){
                    queue.offer(cur.left);
                    isDeepest = false;
                }
                
                if(cur.right != null){
                    queue.offer(cur.right);
                    isDeepest = false;
                }
            }
            
            if(isDeepest && queue.isEmpty()){
                return sum;
            }
        }
        
        return sum;
    }
    
}