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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        
        TreeNode cur = root;
        
        while(true){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                if(stack.isEmpty()) break;
                cur = stack.pop();
                ans.add(cur.val);
                cur = cur.right;
            }
        }
        
        return ans;
    }
}