//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    
    public static void lpsArray(int[] lps, String s){
        
        lps[0] = 0;
        int len = 0, i = 1, n = s.length();
        
        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len-1];
                }
            }
            
        }
    }
    
	public static int addMinChar(String s){
		
		int m = s.length();
		
		StringBuilder sb = new StringBuilder(s);
		StringBuilder rev = new StringBuilder(sb);
		rev.reverse();
		
		s = sb.append("$").append(rev).toString();
    
        // System.out.println(sb);
		
		int n = s.length();
		int lps[] = new int[n];
		
		lpsArray(lps, s);
		
		return m - lps[n-1];
		
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends