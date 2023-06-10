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
    public boolean isTreeSymmetric(TreeNode rootleft ,TreeNode rootright){
        if(rootleft == null && rootright == null) return true;
        
        if((rootleft == null && rootright != null)  || (rootleft != null && rootright == null))
            return false;
        
        if(rootleft.val != rootright.val) return false;
        
        
        return isTreeSymmetric(rootleft.left , rootright.right) && isTreeSymmetric(rootleft.right , rootright.left);
    }
    public boolean isSymmetric(TreeNode root) {
       return isTreeSymmetric(root.left , root.right);
    }
}