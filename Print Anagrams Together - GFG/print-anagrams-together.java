//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] arr) {
        
        List<List<String>> ans = new ArrayList<>();
        int n = arr.length;
        
        Map<Map<Character, Integer>, ArrayList<String>> m = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            String s = arr[i];
            Map<Character, Integer> temp = new HashMap<>();
            
            for(int j = 0; j < s.length(); j++){
                
                Integer t = temp.get(s.charAt(j));
                if(t != null){
                    
                    temp.put(s.charAt(j), ++t);
                }
                else{
                    temp.put(s.charAt(j), 1);
                }
                
            }
            // System.out.println(temp);
            if(m.containsKey(temp) ){
                // System.out.println(temp);
                m.get(temp).add(s);
            }
            else{
                
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                m.put(temp, list);
            }
            
        }
        
        for(Map.Entry<Map<Character, Integer>, ArrayList<String>> itr : m.entrySet()){
            List<String> temp = itr.getValue();
            ans.add(temp);
        }
        
        return ans;
    }
}
