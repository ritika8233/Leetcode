//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int K = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.numOfSubsets(arr,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static int util(int[] arr, int i, int n, int k, int p){
        
        if(p > k || i >= n)return 0;
        
        int a = 0, b = 0;
        
        if(p * arr[i] <= k){
            a = 1 + util(arr, i+1, n, k, p*arr[i]);    
        }
        
        b = util(arr, i+1, n, k, p);
        
        
        return a+b;
    }
    
    static int numOfSubsets(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        
        return util(arr, 0, n, k, 1);
    }
};