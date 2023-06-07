class Solution {
    public int minFlips(int a, int b, int c) {
        
        int ans = 0;
        
        while(a > 0 || b > 0 || c > 0){
            // System.out.println((a&1) + "-" + (b&1) + "-" + (c&1));
            
            if((c&1) == 0){
                ans += a&1;
                ans += b&1;
            }
            else{
                if((a&1) == 0 && (b&1) == 0 )ans++;
            }
            
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        
        return ans;
    }
}