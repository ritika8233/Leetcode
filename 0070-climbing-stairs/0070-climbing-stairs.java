class Solution {
    
   public int climbStairs(int n) {
        
        if(n == 1 || n == 2) return n;
        
        int[] dp = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            if(i == 0){
                dp[i] = 1;
            }
            else{
                dp[i] = dp[i-1] ;
                if(i > 1) dp[i] += dp[i-2];
            }
        }
        
        return dp[n];
    }
}