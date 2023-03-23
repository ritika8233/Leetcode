//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        
        int sum = 0, s = 0, e = 0, ans = Integer.MAX_VALUE, i = 0;
        
        while(i < n){
            sum += arr[i];
            
            // System.out.println(sum + "->" + i);
            
            if(sum > x){
                
                ans = Math.min(ans, (e-s+1));
                
                while(sum > x && s != e){
                    sum -= arr[s++];
                    
                    // System.out.println(sum + "==" + i);
                    
                    if(sum > x){
                        ans = Math.min(ans, (e-s+1));
                    }
                }
                
            }
            i++;
            e++;
        }
        
        return ans;
        
    }
}

