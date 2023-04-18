class Solution {
    public String mergeAlternately(String s1, String s2) {
        
        int n = s1.length(), m= s2.length(), i = 0, j = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i < n && j < m){
            
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }
        
        while(i < n){
            sb.append(s1.charAt(i));
            i++;
        }
        
        while(j < m){
            sb.append(s2.charAt(j));
            j++;
        }
        
        return sb.toString();
    }
}