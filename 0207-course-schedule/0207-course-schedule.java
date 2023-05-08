class Solution {
    public boolean canFinish(int n, int[][] arr) {
        
        int m = arr.length;
        
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[n];
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            adj.get(arr[i][1]).add(arr[i][0]);
            indegree[arr[i][0]]++;
        }
        
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0) q.add(i);
        }
        
        int i = 0;
        
        while(q.size() != 0){
            
            int temp = q.poll();
            i++;
            
            for(int itr : adj.get(temp)){
                if(--indegree[itr] == 0) q.add(itr);
            }
            
        }
        
        if(i == n) return true;
        return false;
        
    }
}