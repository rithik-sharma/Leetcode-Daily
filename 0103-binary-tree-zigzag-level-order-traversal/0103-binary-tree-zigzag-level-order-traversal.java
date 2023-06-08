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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            while(size-- > 0){
                TreeNode front = q.poll();
                
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
                if (flag == true)
                    level.add(front.val);
                else 
                    level.add(0,front.val);
            }
            flag = !flag;
            ans.add(level);
        }
        
        return ans; 
    }
}