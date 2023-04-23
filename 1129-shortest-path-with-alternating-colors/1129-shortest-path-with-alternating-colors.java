class Pair{
    
    int val;
    int col;
    int dis;
    
    Pair(int val, int col, int dis){
        this.val = val;
        this.col = col;
        this.dis = dis;
    }
}

class Solution {
    
//      color red = 0, blue = 1
    
    public int[] shortestAlternatingPaths(int n, int[][] red, int[][] blue) {
        
        int[] ans = new int[n];
        
        List<List<Pair>> adj = new ArrayList<>();
        int[][] vis = new int[2][n];
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < red.length; i++){
            adj.get(red[i][0]).add(new Pair(red[i][1], 0, 1));
        }
        
        for(int i = 0; i < blue.length; i++){
            adj.get(blue[i][0]).add(new Pair(blue[i][1], 1, 1));
        }
        
        Queue<Pair> q = new LinkedList<>();
        
        Arrays.fill(ans, Integer.MAX_VALUE);
        
        for(Pair p : adj.get(0)){
            
            q.add(new Pair( p.val, p.col, 1 ));
            
            if(p.col == 0){
                vis[0][p.val] = 1;
            }
            else{
                vis[1][p.val] = 1;
            }
            
        }
        
        while(q.size() != 0){
            Pair p = q.poll();
            int val = p.val;
            int col = p.col;
            int dis = p.dis;
            
            ans[val] = Math.min(dis, ans[val]);
            
            for(Pair itr : adj.get(val)){
                int currVal = itr.val;
                int currCol = itr.col;
                int currDis = itr.dis;
                
                if(col == 1 && currCol == 0 && vis[0][currVal] == 0){
                    vis[0][currVal] = 1;
                    q.add(new Pair(currVal, currCol, dis+currDis));
                }
                else if(col == 0 && currCol == 1 && vis[1][currVal] == 0){
                    vis[1][currVal] = 1;
                    q.add(new Pair(currVal, currCol, dis+currDis));
                }
            }
            
        }
        ans[0] = 0;
        
        for(int i = 0; i < n; i++){
            if(ans[i] == Integer.MAX_VALUE) ans[i] = -1;
        }
        
        return ans;
    }
}