class Solution {
    public int compress(char[] ch) {
        
        int ans = 0, n = ch.length, i = 0;
        
        List<Character> temp1 = new ArrayList<>();
        
        if(n == 1)return 1;
        
        while(i < n){
            temp1.add(ch[i]);
            ans++;
            int c = 1;
            while((i < n-1) && ch[i] == ch[i+1]){
                c++;
                i++;
            }
            // System.out.println(c);
            if(c > 1){
                List<Character> temp = new ArrayList<>();
    
                while(c != 0){
                    int t = c % 10;
                    
                    char c1 = (char)(t+'0');
                    temp.add(c1);
                    c = c / 10;
                    ans++;
                }
                Collections.reverse(temp);
                for(int k = 0; k < temp.size(); k++){
                    temp1.add(temp.get(k));
                }
            }
            
            i++;
        }
        int p = 0;
        for(int k = 0; k < temp1.size(); k++){
            ch[p] = temp1.get(k);
            p++;
        }
        
        return ans;
    }
}