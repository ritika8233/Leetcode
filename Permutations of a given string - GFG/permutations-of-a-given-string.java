//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    
    public void util(String s, String ans, Set<String> set){
        
        if(s.length() == 0){
            // System.out.println(ans);
            set.add(ans);
            return;
        }
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            String now = s.substring(0, i) + s.substring(i+1);
            
            util(now, ans+ch, set);
        }
        
    }
    
    public List<String> find_permutation(String s) {
        
        List<String> res = new ArrayList<>();
        
        String ans = "";
        
        Set<String> set = new TreeSet();
        
        util(s, ans, set);
        
        Iterator<String> itr = set.iterator();
        
        while(itr.hasNext()){
            
            res.add(itr.next());
        }
        
        return res;
        
    }
}