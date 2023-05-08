class Solution {
    
//     public int util(int[] arr, int n, int t){
        
//         if(t == 0) return 0;
        
//         if(n <= 0 || t < 0) return 10002;
        
//         int take = 1 + util(arr, n, t - arr[n-1]);
//         int nt = util(arr, n-1, t);
        
//         return Math.min(take, nt);
//     }
    
    public int coinChange(int[] arr, int t) {
        
        int n = arr.length;
        
        // return util(arr, n, t);
        int[][] dp = new int[n+1][t+1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= t; j++){
                
                if(j == 0){
                    dp[i][j] = 0;
                }
                else if(i == 0){
                    dp[i][j] = 10002;
                }
                else{
                    int take = 10002;
                    
                    if(j - arr[i-1] >= 0){
                        take = 1 + dp[i][j - arr[i-1]];    
                    }
                    
                    int nt = dp[i-1][j];

                    dp[i][j] =  Math.min(take, nt);
                }
                
            }
        }
        
        if(dp[n][t] == 10002) return -1;
        
        return dp[n][t];
        
    }
}