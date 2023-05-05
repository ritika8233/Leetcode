class Solution {
    public int maxVowels(String str, int k) {
        
        int s = 0, e = 0, n = str.length(), ans = 0, curr = 0;
        
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('a', 1);
        m.put('e', 1);
        m.put('i', 1);
        m.put('o', 1);
        m.put('u', 1);
        
        int l = k;
        
        while(e < n){
            
            if(l > 0){
                if(m.get(str.charAt(e)) != null){
                    curr++;
                }    
                e++;
                l--;
            }
            else{
                // System.out.println(ans + "-" + curr + " e:" + e);
                ans = Math.max(ans, curr);
                if(m.get(str.charAt(s)) != null){
                    curr--;
                }
                s++;
                l = 1;
            }
            
        }
        
        ans = Math.max(ans, curr);
        
        return ans;
    }
}