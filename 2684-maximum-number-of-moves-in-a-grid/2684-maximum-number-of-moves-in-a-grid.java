class Solution {
    
    public int util(int i, int j, int r, int c, int[][] arr, int[][] dp){
        
        if(j >= c-1 || j < 0 || i < 0 || i >= r) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int t1 = 0, t2 = 0, t3 = 0;
        
        //top right
        if(i > 0 && j < c-1 && arr[i-1][j+1] > arr[i][j]){
            t1 += 1 + util(i-1, j+1, r, c, arr, dp);
        }
        
        //same right
        if(j < c-1 && arr[i][j+1] > arr[i][j]){
            t2 += 1 + util(i, j+1, r, c, arr, dp);
        }
        
        //bottom right
        if(i < r-1 && j < c-1 && arr[i+1][j+1] > arr[i][j]){
            t3 += 1 + util(i+1, j+1, r, c, arr, dp);
        }
        
        return dp[i][j] = Math.max(t1, Math.max(t2, t3));
    }
    
    
    public int maxMoves(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        int[][] dp = new int[r+1][c+1];
        
        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= c; j++){
                dp[i][j] = -1;
            }
        }
        
        for(int i = 0; i < r; i++){
            ans = Math.max(ans, util(i, 0, r, c, arr, dp));    
        }
        
        
        return ans;
    }
}