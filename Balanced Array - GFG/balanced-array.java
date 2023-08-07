//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long minValueToBalance(long arr[] ,int n)
    {

        long rs = 0, ls = 0, ans = Long.MAX_VALUE;
        //  1 5 3 2
        //p 1 6 9 11
        //s 11 10 5 2
        for(int i = 0 ;i < n; i++) rs += arr[i];
        
        for(int i = 0; i < n/2; i++){
            rs -= arr[i];
            ls += arr[i];
        }
        
        if(ls == rs) return 0;
        
        return Math.abs(ls - rs);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends