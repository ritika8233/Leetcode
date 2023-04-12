class Solution {
    
    public boolean util(String s, int n, String t, int m){
        
        if(n <= 0)return true;
        if(m <= 0)return false;
        
        if(s.charAt(n-1) == t.charAt(m-1)){
            return util(s, n-1, t, m-1);
        }
        
        return util(s, n, t, m-1);
        
    }
    
    public boolean isSubsequence(String s, String t) {
     
        int n = s.length(), m = t.length();
        return util(s, n, t, m);
        
    }
}