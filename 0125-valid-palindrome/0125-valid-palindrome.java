class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String t = "";
        s = s.toLowerCase();
        
        for(int i = 0; i < n; i++){
           if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
              (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))  {
               t += s.charAt(i);
           }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                t += s.charAt(i);
            }
        }
        //cout<<t;
        n = t.length();
        
        for(int i = 0; i < n/2; i++){
            if(t.charAt(i) != t.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}