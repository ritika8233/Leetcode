class Solution {
    public String getHint(String s1, String s2) {
        
        int n = s1.length(), a = 0, b = 0;
        
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            if(s1.charAt(i) != s2.charAt(i)){
                Integer t = m.get(s1.charAt(i));
                
                if(t == null) m.put(s1.charAt(i), 1);
                else m.put(s1.charAt(i), t+1);
            }
            else{
                a++;
            }
        }
        
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                Integer t = m.get(s2.charAt(i));
                
                if(t != null && t > 0) {
                    b++;
                    m.put(s2.charAt(i), t-1);
                }
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        ans.append(a);
        ans.append("A");
        ans.append(b);
        ans.append("B");
        
        return ans.toString();
    }
}   