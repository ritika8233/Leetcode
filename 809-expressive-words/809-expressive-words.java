class Solution {
    
    public String util(String s){
        
        StringBuilder sb = new StringBuilder();
        int n = s.length(), i = 0;
        
        while(i < n){
            sb.append(s.charAt(i));
            int c = 1;
            while(( i < n-1) && (s.charAt(i) == (s.charAt(i+1)))){
                c++;
                i++;
            }
            sb.append(c);
            i++;
        }
        
        return sb.toString();
    }
    
    public Boolean check(String target, String curr){
        
        int i = 0, j = 0, n = target.length(), m = curr.length();
        
        while(i < n && j < m){
            //first char
            if(target.charAt(i) != curr.charAt(j)) return false;
            i++;
            j++;
            
            //then number
            
            StringBuilder sb1 = new StringBuilder();
            while((i < n) && (target.charAt(i) >= '0' && target.charAt(i) <= '9')){
                sb1.append(target.charAt(i));
                i++;
            }
            
            int num1 = Integer.parseInt(sb1.toString());
            
            StringBuilder sb2 = new StringBuilder();
            while((j < m) && (curr.charAt(j) >= '0' && curr.charAt(j) <= '9')){
                sb2.append(curr.charAt(j));
                j++;
            }
            
            int num2 = Integer.parseInt(sb2.toString());
            
            if(num2 > num1) return false;
            if(num1 < 3){
                if(num1 != num2){
                    return false;
                }
            }
            
        }
        
        if(i != n || j != m) return false;
        
        return true;
    }
    
    public int expressiveWords(String s, String[] words) {
        
        int ans = 0, n = words.length;;
        
        String target = util(s);
        
        for(int i = 0; i < n; i++){
            String curr = util(words[i]);
      
            if(target.equals(curr) == false){
            
                if(check(target, curr) == true){
                    ans++;
                }
            }
        }
        
        return ans;
    }
}