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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        TreeNode parent = null , cur = root;
        while(cur != null){
            if(key > cur.val){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur; 
                cur = cur.left;
            }
        }
        TreeNode newNode = new TreeNode(key);
        if(parent == null) return newNode;
        
        if(key > parent.val){
            parent.right = newNode;
        }else{
            parent.left = newNode;
        }
        
        return root;
    }
    
}