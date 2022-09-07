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
    
    public String tree2str(TreeNode root) {
        
        if(root == null)return "";
        
        String s = Integer.toString(root.val);
        
        int flag = 0;
        
        if(root.left != null){
            s += '(' + tree2str(root.left);  
            s += ')';
            flag = 1;
        }
        
        if(root.right != null){
            
            if(flag == 0){
                s += '(' + tree2str(root.left);  
                s += ')';
            }
            
            s += '('  + tree2str(root.right);
            s += ')';
        }
    
    
        
        return s;
    }
}