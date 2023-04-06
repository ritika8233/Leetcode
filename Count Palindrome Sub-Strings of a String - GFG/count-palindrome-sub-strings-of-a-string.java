//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public boolean check(String temp){
        
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        
        return temp.equals(sb.toString());
    }
    
    public int util(String s, int i, int n, String temp){
        
        if(i >= n)return 0;
        
        int ans = 0;
        temp += s.charAt(i);
        if(temp.length() >= 2 && check(temp)){
            ans++;
        }
        ans += util(s, i+1, n, temp);
        
        return ans;
    }
    
    public int CountPS(String s, int n)
    {
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            ans += util(s, i, n, "");
        }
            
        
        return ans;
    }
}