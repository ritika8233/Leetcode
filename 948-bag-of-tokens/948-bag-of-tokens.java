class Solution {
    public int bagOfTokensScore(int[] arr, int p) {
        
        int s = 0, ans = 0, n = arr.length;
        
        if(n == 0)return 0;
        
        Arrays.sort(arr);
        
        if(arr[0] > p)return 0;
        
        int l = 0, r = n-1;
        
        while(l <= r){
            
            ans = Math.max(ans, s);
            
            if(arr[l] <= p){
                s++;
                p -= arr[l];
                //System.out.println(arr[l] + " " + p);
                l++;
            }
            else{
                p+= arr[r];
               // System.out.println(arr[r] + " " + p);
                if(s == 0)break;
                s--;
                r--;
            }
            
        }
        
        ans = Math.max(ans, s);
        
        return ans;
    }
}