class Result{

    int c;
    boolean status;
    
    Result(){}
    
    Result(int c, boolean status){
        this.c = c;
        this.status = status;
    }

}

class Solution {
    
    
    public boolean dfs(int[][] arr, int i, int j, int r, int c, int[][] vis, Result res){
        
        if(i < 0 || j < 0 || i >= r || j >= c) return true;
        
        if(arr[i][j] == 0)return false;
        if(vis[i][j] == 1)return false;
            
        vis[i][j] = 1;
        
        res.c += 1;
        
        boolean left = dfs(arr, i, j-1, r, c, vis, res);
        boolean right = dfs(arr, i, j+1, r, c, vis, res);
        boolean up = dfs(arr, i-1, j, r, c, vis, res);
        boolean bottom = dfs(arr, i+1, j, r, c, vis, res);
        
        return res.status = left || right || up || bottom;
    }
    
    
    public int numEnclaves(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        
        int[][] vis = new int[r+1][c+1];
        
        
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){

                if(vis[i][j] == 0 && arr[i][j] == 1){
                    
                    Result res = new Result();
                    
                    if(dfs(arr, i, j, r, c, vis, res) == false){
                        
                        ans += res.c;
                        
                        // System.out.println(i + "-" + j + "=" + ans);
                    }
                }
                
            }
        }
        return ans;
    }
}