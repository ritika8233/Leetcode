//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends



class Solution {
    
    static void util(int[][] arr, int row, int col, int n, String res, ArrayList<String> ans){
        
        if (row >= n || col >= n || row < 0 || col < 0
            || arr[row][col] == 0) {
            return;
        }
        
        if(row == n-1 && col == n-1){
            ans.add(res);
            // System.out.println(res);
            
            return;
        }
    
            arr[row][col] = 0;
    
            util(arr, row, col+1, n, res+"R", ans);
            util(arr, row, col-1, n, res+"L", ans);
            util(arr, row-1, col, n, res+"U", ans);
            util(arr, row+1, col, n, res+"D", ans);
            
            arr[row][col] = 1;   
            // res = res.substring(res.length()-1);
        
        
        // return true;
    }
    
    public static ArrayList<String> findPath(int[][] arr, int n) {

        ArrayList<String> ans = new ArrayList<>();
    
        // if(arr[0][0] == 0)return ans;
    
        // String res = "";
        util(arr, 0, 0, n, "", ans);
        
        return ans;    
    }
}