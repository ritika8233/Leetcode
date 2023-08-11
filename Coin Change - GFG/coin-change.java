//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int arr[], int n, int t) {
        
        long[][] dp = new long[n+1][t+1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= t; j++){
                if(j == 0){
                    dp[i][j] = 1;
                }
                else if(i == 0){
                    dp[i][j] = 0;
                }
                else{
                    long a = 0;
                    if(j -arr[i-1] >= 0){
                        a += dp[i][j-arr[i-1]];
                    }
                    a += dp[i-1][j];
                    dp[i][j] = a;
                }
            }
        }
        
        return dp[n][t];
    }
}