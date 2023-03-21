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
    
    public void util(TreeNode root, List<String> ans, String temp){
        
        // if(root == null)return ;
        if(temp != "")temp += "->";
        temp += root.val ;
        if(root.left == null && root.right == null){
            
            ans.add(temp);
            return;
        }
        
        
        if(root.left != null) util(root.left, ans, temp);
        if(root.right != null) util(root.right, ans, temp);
        
        temp = temp.substring(0, temp.length()-1);
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<>();
        
        if(root == null)return ans;
        
        util(root, ans, "");
        
        return ans;
    }
}