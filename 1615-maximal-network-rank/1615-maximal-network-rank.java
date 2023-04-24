class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        int ans = 0;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < roads.length; i++){
            adj.get(roads[i][0]).add(roads[i][1]);
            adj.get(roads[i][1]).add(roads[i][0]);
        }
        
        for(int u = 0; u < n; u++){
            
            for(int v = u+1; v < n; v++){
            
                int temp = 0;

                for(int itr : adj.get(u)){
                    if(itr != v) temp += 1;
                }
                for(int itr : adj.get(v)){
                    temp += 1;
                }
                ans = Math.max(ans, temp);
            }
            
            
        }
        
        
        return ans;
    }
}