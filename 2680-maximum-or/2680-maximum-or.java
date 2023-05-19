class Solution {
    public long maximumOr(int[] arr, int k) {
        
        int n = arr.length;
        
        int[] pre = new int[n];
        int[] suff = new int[n];
        
        long ans = 0;
        pre[0] = arr[0];
        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1] | arr[i];
        }
        
        suff[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            suff[i] = suff[i+1] | arr[i];
        }
        
        for(int i = 0; i < n; i++){
            long num = arr[i];
            int c = k;
            while(c != 0){
                num = num * 2;
                c--;
            }
            if(n == 1)return num;
            
            if(i == 0) {
                ans = Math.max(ans, (num | suff[i+1]) );
            }
            else if(i == n-1){
                ans = Math.max(ans, (num | pre[i-1]) );
            }
            else{
                ans = Math.max(ans, (num | suff[i+1] | pre[i-1]) );
            }
        }
        return ans;
    }
}