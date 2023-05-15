class Solution {
    public String multiply(String s1, String s2) {
        
        StringBuilder sb = new StringBuilder();
        int n = s1.length(), m = s2.length();
        
        int[] pos = new int[m+n];
        
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int p1 = i+j, p2 = i+j+1;
                
                int sum = mul + pos[p2];
                pos[p1] += sum /10;
                pos[p2] = sum%10;
            }
        }
        
        for(int itr : pos){
            if(!(itr == 0 && sb.length() == 0)) sb.append(itr);
        }
        
        if(sb.length() == 0) return "0";
        
        return sb.toString();
    }
}