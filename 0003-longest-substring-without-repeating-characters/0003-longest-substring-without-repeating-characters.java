class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length(), ans = 0, l = 0, r = 0;
        
        Map<Character, Integer> m = new HashMap<>();
        
        while(r < n){
            
            
            Integer t = m.get(s.charAt(r));
            
            System.out.print(s.charAt(r) +"-"+t+ "===");
            if(t == null){
                m.put(s.charAt(r), r);
            }
            else{
                if(t >= l){
                    l = t+1;
                }
                m.put(s.charAt(r), r);
            }
            
            ans = Math.max(ans, r-l+1);
            // System.out.println(l+"-"+r+"="+ans);

            
            r++;
            
        }
        
        return ans;
    }
}