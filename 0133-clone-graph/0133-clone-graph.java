/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    public void dfs(Node root, Node node, Node[] vis){
        
        // if(node == null)return;
        
        vis[root.val] = root;
        
        for(Node itr : node.neighbors){
            
            if(vis[itr.val] == null){
                
                Node temp = new Node(itr.val);
                root.neighbors.add(temp);
                dfs(temp, itr, vis);
            }
            else{
                root.neighbors.add(vis[itr.val]);
            }
            
        }
    }
    
    public Node cloneGraph(Node node) {
        if(node == null)return null;
        
        Node[] vis = new Node[101];
        Arrays.fill(vis , null);
        
        Node root = new Node(node.val);
        
        dfs(root, node, vis);
        
        return root;
    }
}