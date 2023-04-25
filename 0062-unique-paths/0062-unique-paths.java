class Solution {
    
//     public int util(int m, int n){
        
//         if( m <= 0 || n <= 0) return 0;
//         if(m == 1 && n == 1) return 1;
        
        
//         int left = 0, up = 0;
//         left += util(m, n-1);
//         up += util(m-1, n);
        
//         return left + up;
//     }
    
    public int uniquePaths(int m, int n) {
        
        // return util(m, n);
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(i == 1 && j == 1) dp[i][j] = 1;
                else{
                    int up = 0, left = 0;
                    left += dp[i][j-1];
                    up += dp[i-1][j];
                    
                    dp[i][j] = left+up;
                }
            }
        }
        
        return dp[m][n];
    }
}