/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> l1 = new ArrayList<>();
        ArrayList<TreeNode> l2 = new ArrayList<>();
        isPresent(root,p.val, l1);
        isPresent(root,q.val, l2);
       
        int i = l1.size()-1;
        int j = l2.size()-1;
        while(i>=0 && j>=0 && l1.get(i).val == l2.get(j).val){
            i--;
            j--;
        }
        if(i == l1.size()-1) return null;
        return l1.get(i+1);
    }
    
    public static boolean isPresent(TreeNode root,int target, ArrayList<TreeNode> arr){
        if(root == null) return false;
        if(root.val == target || isPresent(root.left,target, arr) || isPresent(root.right,target,arr)){
            arr.add(root);
            return true;
        }
        return false;
    }
    
}