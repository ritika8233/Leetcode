//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String s){
        
        int n = s.length(), l = 0, r = 0, ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        
        while(r < n){
            
            if(m.containsKey(s.charAt(r))){
                l = Math.max(l, m.get(s.charAt(r)) +1 );
            }
            
            m.put(s.charAt(r), r);
            ans = Math.max(ans, r - l +1);
            r++;
        }
        
        return ans;
    }
}