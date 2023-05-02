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
    
    public int height(TreeNode root){
        if(root == null) return 0;
        
        return Math.max(height(root.left), height(root.right))+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null || (root.left == null && root.right == null)) return 0;
        
        int ans = 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        // System.out.println(left + "-" + right);
        
        ans = Math.max(ans, (left+right));
        
        
        
        return Math.max(ans, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
}