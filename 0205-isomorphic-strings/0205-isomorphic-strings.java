class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length();
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        int c1 = 1, c2 = 1;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            
            Integer t1 = m1.get(s.charAt(i));
            Integer t2 = m2.get(t.charAt(i));
            
            if(t2 != t1)return false;
            
            if(t1 != null){
                
                sb1.append(String.valueOf(t1) );
                sb2.append(String.valueOf(t2) );
            }
            else{
                sb1.append(String.valueOf(c1));
                m1.put(s.charAt(i), c1);
                c1++;
                
                sb2.append(String.valueOf(c2));
                m2.put(t.charAt(i), c2);
                c2++;
            }
            
            if(c1 != c2)return false;
        }
        
        // System.out.println(sb1.toString());
        // System.out.println(sb2.toString());
        
        return sb1.toString().equals(sb2.toString());
    }
}