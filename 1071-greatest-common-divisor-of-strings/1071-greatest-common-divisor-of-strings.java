class Solution {
    public String gcdOfStrings(String s1, String s2) {
        
        if(!(s1+s2).equals(s2+s1))return "";
        int len = gcd(s1.length(), s2.length());
        return s1.substring(0, len);
        
    }
    
    public int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a%b);
    }
    
}