class Solution {
    
//     public int util(int[] arr, int n){
        
//         if(n <= 0) return 0;
//         if(n == 1) return arr[n-1];
        
//         return Math.min(util(arr, n-1), util(arr, n-2))+arr[n-1];
//     }
    
    public int minCostClimbingStairs(int[] arr) {
        
        int n = arr.length;
        if(n == 1 ) return arr[0];
        if(n == 2) return Math.min(arr[0], arr[1]);
        
        // return Math.min(util(arr, n), util(arr, n-1));
        
        int[] dp = new int[n+1];
        
        dp[1] = arr[0];
        
        for(int i = 2; i <= n; i++){
            
            dp[i] = Math.min(dp[i-1], dp[i-2]) + arr[i-1];
            
        }
        return Math.min(dp[n], dp[n-1]);
    }
}