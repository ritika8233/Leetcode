class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length();
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        int c1 = 1, c2 = 1;

        for(int i = 0; i < n; i++){
            
            Integer t1 = m1.get(s.charAt(i));
            Integer t2 = m2.get(t.charAt(i));
            
            if(t2 != t1)return false;
            if(c1 != c2)return false;
            
            if(t1 == null){
                
                m1.put(s.charAt(i), c1);
                c1++;
                
                m2.put(t.charAt(i), c2);
                c2++;
            }
            
        }
        
        return true;
    }
}