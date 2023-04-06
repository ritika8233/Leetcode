class Solution {
    
    
    public boolean dfs(int i, int j, int r, int c, int[][] arr, int[][] vis){
        
        if(i < 0 || j < 0 || i >= r || j >= c )return false;
        
        if(arr[i][j] == 1){
            return true;
        }
        
        if(vis[i][j] == 1)return true;
        
        vis[i][j] = 1;
        
        
        
        boolean left = dfs(i, j-1, r, c, arr, vis);
        boolean right = dfs(i, j+1, r, c, arr, vis);
        boolean up = dfs(i-1, j, r, c, arr, vis);
        boolean bottom = dfs(i+1, j, r, c, arr, vis);
        
        return left & right & up & bottom;
    }
    
    public int closedIsland(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        int[][] vis = new int[r][c];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                
                if(arr[i][j] == 0 && vis[i][j] == 0){
                    
                    if(dfs(i, j, r, c, arr, vis)){
                        ans++;
                    }
                    // System.out.println(i + "-" + j + "="+ans);
                }
            }
        }
        
        return ans;
    }
}