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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            while(size-- > 0){
                TreeNode front = q.poll();
                level.add(front.val);
                
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
            }
            stack.push(level);
        }
        
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        
        return ans;
    }
}