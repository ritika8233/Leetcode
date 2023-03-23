//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long arr1[],long arr2[],int n)
    {
        Map<Long, Integer> m = new HashMap<>();
        
        if(arr1.length != arr2.length)return false;
        
        for(int i = 0; i < n; i++){
            
            Integer t = m.get(arr1[i]);
            
            if(t == null) m.put(arr1[i], 1);
            else m.put(arr1[i], t+1);
        }
        
        for(int i = 0; i < n; i++){
            Integer t = m.get(arr2[i]);
            
            if(t != null) m.put(arr2[i], t-1);
            else return false;
        }
        
        for(Map.Entry<Long, Integer> itr : m.entrySet()){
            if(itr.getValue() != 0)return false;
        }
        
        return true;
    }
}