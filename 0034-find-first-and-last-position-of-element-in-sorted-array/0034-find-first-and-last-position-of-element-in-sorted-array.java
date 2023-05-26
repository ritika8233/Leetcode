class Solution {
    
    public int left(int[] arr, int l, int r, int t){
        int ans = -1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(arr[m] == t){
                ans = m;
                r = m-1;
            }
            else if(arr[m] > t) r = m-1;
            else l = m+1;
        }
        return ans;
    }
    public int right(int[] arr, int l, int r, int t){
        int ans = -1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(arr[m] == t){
                ans = m;
                l = m+1;
            }
            else if(arr[m] < t) l = m+1;
            else r = m-1;
        }
        return ans;
    }
    
    public int[] searchRange(int[] arr, int t) {
        
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        int l = 0, r = arr.length-1;
        
        ans[0] = left(arr, l, r, t);
        ans[1] = right(arr, l, r, t);
        
        
        return ans;
    }
}