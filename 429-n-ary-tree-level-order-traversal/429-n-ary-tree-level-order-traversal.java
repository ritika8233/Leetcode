/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public int height(Node root){
        
        if(root == null)return 0;
        
        int ans = 0;
        
        for(int i = 0; i < root.children.size(); i++){
            
            ans = Math.max(ans, height(root.children.get(i)));
            
        }
            
        return ans+1;
        
    }
    
    public void util(Node root, int h, int l, List<Integer> temp){
        
        if(root == null)return;
        
        if(h == l){
            temp.add(root.val);
            return;
        }
        
        for(int i = 0; i < root.children.size(); i++){
            util(root.children.get(i), h, l+1, temp);
        }
    }
    
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int h = height(root);
        
        //System.out.println(h);
        
        for(int i = 1; i <= h; i++){
            List<Integer> temp = new ArrayList<>();
            
            util(root, i, 1, temp);
            
            if(temp.size() > 0)ans.add(temp);
        }
        
        return ans;
        
    }
}