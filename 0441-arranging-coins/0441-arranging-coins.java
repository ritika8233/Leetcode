class Solution {
    public int arrangeCoins(int n) {
        
        int ans = 0, row = 1, num = 0;
        
        if(n == 1) return 1;
        
        while(n >= row){
            // System.out.print(num+" ");
            n -= row;
            row++;
            ans++;
        }
        
        return ans;
    }
}