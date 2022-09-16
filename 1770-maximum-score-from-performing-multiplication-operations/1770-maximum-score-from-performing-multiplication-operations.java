class Solution {
    
    int[][] dp;
    
    public int util(int i, int n, int[] nums, int j, int[] mul){
        
        if(j == mul.length)return 0;
        
        if(dp[i][j] != 0)return dp[i][j];
        
        int a = mul[j]*nums[i] + util(i+1, n, nums, j+1, mul);
        
        int b = mul[j]*nums[(n - 1) - (j - i)] + util(i, n, nums, j+1, mul);
        
        return dp[i][j] = Math.max(a, b);
    }
    
    public int maximumScore(int[] nums, int[] mul) {
        
        int n = nums.length, m = mul.length;
        
        dp = new int[m][m];
        
        return util(0, n, nums, 0, mul);
    
    }
}