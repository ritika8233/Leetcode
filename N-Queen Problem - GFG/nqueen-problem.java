//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    
    static boolean check(int[][] board, int row, int col, int n){
        
        
        // same col
        for(int i = 0; i < n; i++){
            if(board[i][col] == 1)return false;
        }
        
        // left top diag
        for(int i = row, j = col; i >=0 && j >= 0; i--, j--){
            if(board[i][j] == 1)return false;
        }
        
        // top right 
        for(int i = row, j = col; i >= 0 && j < n; i-- , j++){
            if(board[i][j] == 1)return false;
        }
        
        return true;
    }
    
    static boolean util(int[][] board, int row, int n, ArrayList<ArrayList<Integer>> ans){
        
        if(row == n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(board[i][j] == 1) temp.add(j+1);
                }
            }
            ans.add(temp);
            return true;
        }
        
        for(int i = 0; i < n; i++){
            if(check(board, row, i, n)){
                board[row][i] = 1;
                
                util(board, row+1, n, ans);
                
                board[row][i] = 0;
            }
        }
        
        return false;
    }
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        int[][] board = new int[n][n];
        
        util(board, 0, n, ans);
        
        
        
        return ans;
    }
}