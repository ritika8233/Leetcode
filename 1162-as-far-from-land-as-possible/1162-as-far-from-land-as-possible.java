class Solution {
    
    public int maxDistance(int[][] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int maxDist = -1;
        
        // initialize dp array with max value
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        // update dp array with distance to nearest 1
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    if(i > 0 && dp[i-1][j] != Integer.MAX_VALUE){
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
                    }
                    if(j > 0 && dp[i][j-1] != Integer.MAX_VALUE){
                        dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
                    }
                }
            }
        }
        
        // update dp array with distance to farthest 1
        for(int i = n-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(arr[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    if(i < n-1 && dp[i+1][j] != Integer.MAX_VALUE){
                        dp[i][j] = Math.min(dp[i][j], dp[i+1][j] + 1);
                    }
                    if(j < n-1 && dp[i][j+1] != Integer.MAX_VALUE){
                        dp[i][j] = Math.min(dp[i][j], dp[i][j+1] + 1);
                    }
                    maxDist = Math.max(maxDist, dp[i][j]);
                }
            }
        }
        
        if(maxDist == Integer.MAX_VALUE){
            return -1;
        }
        return maxDist;
    }
}
