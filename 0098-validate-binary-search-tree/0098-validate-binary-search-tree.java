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
    
    public boolean util(long mini, TreeNode root, long maxi){
        
        if(root == null)return true;
        
        if(root.val <= mini || root.val >= maxi) return false;
        
        return util(mini, root.left, root.val) && util(root.val, root.right, maxi);
    }
    
    public boolean isValidBST(TreeNode root) {
        
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        
        return util(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }
}