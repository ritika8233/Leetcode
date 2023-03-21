//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] arr1, int[] arr2, int n) {
        
        int c = 0, sum = 0, i = 0, j = 0 ;
        
        while(i < n && j < n){
            
            if(c > n)break;
            
            if(c == n-1 || c == n){
                if(arr1[i] < arr2[j]){
                    sum += arr1[i];
                     i++;
                }
                else{
                    sum += arr2[j];
                    j++;
                }
                c++;
            }
            else{
                if(arr1[i] < arr2[j]){
                    i++;
                }
                else{
                    j++;
                }
                c++;    
            }
            
        }
        
        if(c <= n){
            
            while(i != n){
                
                if(c > n)break;
                
                if(c == n-1 || c  == n){
                    sum += arr1[i];
                    
                }
                
                i++;
                c++;
            }
            
            while(j != n){
                
                if(c > n)break;
                
                if(c == n-1 || c  == n){
                    sum += arr2[j];
                    
                }
                
                j++;
                c++;
            }
            
        }            
        return sum;
    }
}