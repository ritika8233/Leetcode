class Solution {
    
    public void dfs(int i, int n, List<List<Integer>> adj, int[] vis){
        
        if(i == n) return;
        vis[i] = 1;
        
        for(int itr : adj.get(i)){
            if(vis[itr] == 0){
                dfs(itr, n, adj, vis);
            }
        }

    }
    
    public int makeConnected(int n, int[][] graph) {
        
        int[] vis = new int[n];
        
        if (graph.length < n - 1) return -1;
        
        int extraEdges = 0, components = 0;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < graph.length; i++){
            int u = graph[i][0];
            int v = graph[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                components++;
                dfs(i, n, adj, vis);
            }
        }
        
            
            return components-1;
//         }
        
//         return -1;
    }
}