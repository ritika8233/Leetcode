class Solution {
    
    public void util(int i, int n, List<List<Integer>> adj, int[] vis){
        
        if(i == n) return;
        
        vis[i] = 1;
        
        for(int itr : adj.get(i)){
            if(vis[itr] == 0){
                util(itr, n, adj, vis);
            }
        }
        
    }
    
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        
        int n = adj.size();
        int[] vis = new int[n];
        
        util(0, n, adj, vis);
        
        for(int i = 0; i < n; i++){
            if(vis[i] == 0)return false;
            // System.out.println(vis[i]);
        }
        
        return true;
    }
}