class Solution {
    
//     public int util(int[] arr, int n){
        
//         if(n <= 0) return 0;
        
//         int t =  arr[n-1] + util(arr, n-2);
//         int nt = util(arr, n-1);
        
//         return Math.max(t, nt);
//     }
    
    public int rob(int[] arr) {
        
        int n = arr.length;
        
        if(n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0], arr[1]);
        
        // return Math.max(util(arr, n), util(arr, n-1));
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[0];
        dp[2] = arr[1];
        
        for(int i = 3; i <= n; i++){
            dp[i] = arr[i-1] + Math.max(dp[i-2], dp[i-3]);
        }
        
        return Math.max(dp[n], dp[n-1]);
    }
}