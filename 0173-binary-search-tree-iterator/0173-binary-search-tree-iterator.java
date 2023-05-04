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
class BSTIterator {

    public void util(TreeNode root, Queue<Integer> q){
        
        if(root == null) return;
        
        util(root.left, q);
        q.add(root.val);
        util(root.right, q);
    }
    
    Queue<Integer> q = new LinkedList<>();
    
    public BSTIterator(TreeNode root) {
        util(root, q);
    }
    
    public int next() {
        if(q.size() == 0) return -1;
        
        return q.poll();
    }
    
    public boolean hasNext() {
        if(q.size() == 0) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */