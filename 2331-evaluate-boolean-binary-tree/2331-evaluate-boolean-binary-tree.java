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
    public boolean evaluateTree(TreeNode root) {
        
        // if(root == null)return false;
        if(root.left == null && root.right == null){
            if(root.val == 0)return false;
            return true;
        }
        
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        
        
        int t = root.val;
        
        if(t == 2){
            return( left || right);
            
        }
        
        
            return (left && right);
        
    }
}