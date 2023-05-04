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
    
    public void util(TreeNode root, PriorityQueue<Integer> pq){
        
        if(root == null) return;
        
        pq.add(root.val);
        util(root.left, pq);
        util(root.right, pq);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        util(root, pq);
        
        int ans = -1;
        
        while(pq.size() != 0 && k != 0){
            k--;
            ans = pq.poll();
        }
        
        if(k != 0) return -1;
        return ans;
    }
}