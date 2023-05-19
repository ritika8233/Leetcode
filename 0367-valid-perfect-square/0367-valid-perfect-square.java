class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num == 1) return true;
        
        int l = 1, r = num/2;
        
        while(l <= r){
            int m = l + (r - l) /2;
            long mul =(long) m * m;
            if(mul == num)return true;
            if(mul > num) r = m-1;
            else l = m+1;
        }
        
        return false;
    }
}