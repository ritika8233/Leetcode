class Solution {
    public int maxDistance(int[] arr1, int[] arr2) {
        
        int n = arr1.length, n2 = arr2.length, ans = 0;
        
        for(int i = 0; i < n; i++){
            int l = 0, r = n2-1, ind = 0;
            while(l <= r){
                int m = l+(r-l)/2;
                if(arr2[m] >= arr1[i]){
                    ind = m;
                    l = m+1;
                }
                else r = m-1;
            }
            if(i <= ind){
                // System.out.println(i+"-"+ind);
                ans = Math.max(ans, ind - i);
            }
            
        }
        
        return ans;
    }
}