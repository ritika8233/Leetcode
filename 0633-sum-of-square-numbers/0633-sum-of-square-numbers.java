class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (long) Math.sqrt(c);
        
        while(l <= r){
            long sql = l * l;
            long sqr = r * r;
            
            if((sql + sqr) == c)return true;
            if((sql+sqr) > c) r--;
            else l++;
        }
        
        return false;
    }
}