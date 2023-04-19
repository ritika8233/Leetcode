class Solution {
    
    public void util(int i, int n, int[][] adj, int[] vis, List<Integer> temp, List<List<Integer>> ans){
        
        if(i == n-1){
            temp.add(n-1);
            ans.add(new ArrayList<>(temp));
        }
        else{
            temp.add(i);
            vis[i] = 1;
            
            for(int itr : adj[i]){
                if(vis[itr] == 0){
                    util(itr, n, adj, vis, temp, ans);
                }
            }
        }
        vis[i] = 0;
        temp.remove(temp.size()-1);
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] adj) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = adj.length;
        int[] vis = new int[n];
        
        util(0, n, adj, vis, new ArrayList<>(), ans);
        
        return ans;
    }
}