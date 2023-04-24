class Solution {
    
    public void util(int i, int n, List<List<Integer>> adj, int[] vis){
        
        if(i >= n)  return;
        
        
        for(int itr : adj.get(i)){
            if(vis[itr] == 0){
                vis[itr] = 1;
                util(itr, n, adj, vis);
            }
        }
        
    }
    
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> ans = new ArrayList<>();
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.size(); i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        
        int[] vis = new int[n];
        
        for(int i = 0; i < n; i++){
            
            util(i, n, adj, vis);
            
        }
        
        for(int  i = 0; i < n; i++){
            if(vis[i] == 0) ans.add(i);
        }
        
        return ans;
    }
}