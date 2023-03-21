class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        
        int n = s.length();
        
        String s1 = s.substring(1, n) + s.substring(0, n-1);
        
        return s1.contains(s);
        
    }
}