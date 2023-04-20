class Solution {
    
    public void util(int i, int n, List<List<Integer>> adj, int[] vis){
        
        if(i >= n) return;
        
        vis[i] = 1;
        
        for(int itr : adj.get(i)){
            if(vis[itr] == 0){
                util(itr, n, adj, vis);
            }
        }
        
    }
    
    public int findCircleNum(int[][] arr) {
        
        int ans = 0, n = arr.length;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < arr[i].length; j++){
                
                if(arr[i][j] == 1){
                    temp.add(j);
                }
            }
            adj.add(temp);
        }
        
        int[] vis = new int[n+1];
        
        for(int i = 0; i < n; i++){
            
            if(vis[i] == 0){
                ans++;
                util(i, n, adj, vis);
            }
            
        }
        
        return ans;
    }
}