class Solution {
    
    public boolean util(int[] vis, int i, int n, int[][] adj){
        
        if(i == n) return true;
        
        boolean flag = true;
        
        for(int itr : adj[i]){
            
            if(vis[itr] != 0 && vis[itr] == vis[i]) {
                flag =  false;
            }
            else if(vis[itr] == 0){
                if(vis[i] == 1) vis[itr] = 2;
                else vis[itr] = 1;
                flag = util(vis, itr, n, adj);
            }
        }
        
        return flag;
    }
    
    public boolean isBipartite(int[][] adj) {
     
        int n = adj.length;
        int vis[] = new int[n];
        
        
        
        for(int i = 0; i < n; i++){
            
            if(vis[i] == 0) {
                vis[i] = 1;
            }
            if(util(vis, i, n, adj) == false) return false;
            
        }
        
        return true;
    }
}