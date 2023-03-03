class Solution {
    
    
    public int strStr(String s1, String s2) {
       
        int n = s1.length(), m = s2.length();
        
       
        for(int i = 0; i <= n-m; i++){
            
            boolean flag = true;
            
            for(int j = 0; j < m; j++){
                
                if(s1.charAt(i+j) != s2.charAt(j)){
                    flag = false;
                    break;
                }
                
            }
            
            if(flag == true)return i;
            
        }
        
        return -1;
        
    }
}