//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static int util(int r, int c, int mat[][], int[][] dp){
        
            int n = mat.length; 
            
            if(r >= n || c >= n || r < 0 || c < 0)return 0;
            
            if(dp[r][c] != -1)return dp[r][c];
        
            int left = 0, right = 0, down = 0;
            
            left = mat[r][c] + util(r+1, c-1, mat, dp);
            right = mat[r][c] + util(r+1, c+1, mat, dp);
            down = mat[r][c] + util(r+1, c, mat, dp);
            
            return dp[r][c] = Math.max(left, Math.max(right, down));
    }
    
    static int maximumPath(int n, int mat[][])
    {
        
        int ans = 0;
        int[][] dp = new int[n+1][n+1];
        
        for(int i = 0; i <= n; i++){
         
            Arrays.fill(dp[i], -1);
            
        }
        
        // all col of row 0
        for(int i = 0; i < n; i++){
            
            ans = Math.max(ans, util(0, i, mat, dp));
            
        }
        return ans;
    }
}