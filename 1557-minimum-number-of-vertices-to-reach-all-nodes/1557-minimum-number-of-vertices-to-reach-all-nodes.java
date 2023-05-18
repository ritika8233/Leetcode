class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> ans = new ArrayList<>();
        int m = edges.size();
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        int[] incoming = new int[n];
        
        for(int i = 0; i < m; i++){
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            adj.get(u).add(v);
            incoming[v]++;
        }
        
        for(int i = 0; i < n; i++){
            if(incoming[i] == 0) ans.add(i);
        }
        
        
        return ans;
    }
}