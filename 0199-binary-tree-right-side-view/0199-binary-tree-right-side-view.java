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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans =  new ArrayList<>();
        
        if(root == null) return ans;
        
        if(root.left == null && root.right == null) {
            ans.add(root.val);
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() != 0){
            
            int m = q.size();
            int last = 0;
            
            for(int i = 0; i < m; i++){
                
                TreeNode curr = q.poll();
                last = curr.val;
                // System.out.print(curr.val + " ");
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            
            // System.out.println();
            ans.add(last);
        }
        
        
        return ans;
    }
}