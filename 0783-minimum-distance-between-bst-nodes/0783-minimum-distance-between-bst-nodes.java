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
class Solution 
{
    int prev=Integer.MAX_VALUE,diff=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) 
	{
       check(root);
        return diff;
    }
    public void check(TreeNode root)
	{
        if(root==null) return;
        check(root.left);
        diff=Math.min(diff,Math.abs(root.val-prev));
        prev=root.val;
        check(root.right);
    }
}