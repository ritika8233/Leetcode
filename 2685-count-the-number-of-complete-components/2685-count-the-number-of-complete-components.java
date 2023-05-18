class Result{
    
    int num;
    int edge;
    
}

class Solution {
    
    public int util(List<List<Integer>> adj, int[] vis, int i, int n, Result res){
        if(i >= n || vis[i] == 1) return 0;
        vis[i] = 1;
        int c = 1, edge = 0;
        
        for(int itr : adj.get(i)){
            // edge++;
            res.edge += 1;
            // System.out.println(i + "-" + itr);
            if(vis[itr] == 0){
                // System.out.println(i + "-" + itr);
                c += util(adj, vis, itr, n, res);
            }
        }
        
        return res.num = c;
    }
    
    public int countCompleteComponents(int n, int[][] edges) {
       
        int[] dp = new int[51];
        int c = 1, m = edges.length, ans = 0;
        
        for(int i = 2; i <= 50; i++){
            dp[i] = dp[i-1] + c;
            c++;
        }
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int[] vis = new int[n];
        
        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                Result res = new Result();
                int count = util(adj, vis, i, n, res);
                
                if(res.edge/2 >= dp[res.num]) ans++;
                
                // System.out.println(count + "==" + res.edge);
            }
        }
        
        return ans;
    }
}