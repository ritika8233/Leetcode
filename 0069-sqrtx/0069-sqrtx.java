class Solution {
    public int mySqrt(int x) {
        
        long l = 0, r = x;
        
        while(l <= r){
            long m = l + (r-l)/2;
            if(m*m == (long)x) return (int)m;
            if(m*m < x){
                l = m+1;   
            }
            else r = m-1;
        }
        
        return (int)l-1;
    }
}