//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    
    String reverseWords(String s)
    {
        
        String[] arr = s.split("\\.");
        
        // System.out.println(arr.length);

        
        String res = "";
        
        Collections.reverse(Arrays.asList(arr));
            
        for(int i = 0; i < arr.length; i++){
            
            // System.out.println(arr[i]);
            res += arr[i] ;
            if(i < (arr.length -1)){
                res += ".";
            }
            
        }
            
        return res;
    }
}