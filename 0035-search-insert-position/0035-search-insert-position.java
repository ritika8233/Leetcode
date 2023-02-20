class Solution {
    
    public int util(int l, int r, int t, int[] arr){

        if(l < r){
    
            int m = l + (r-l)/2;
            
            if(arr[m] == t){
                return m;
            }
            else if(arr[m] > t){
                return util(l, m-1, t, arr);
            }
            return util(m+1, r, t, arr);
            
        }
        return l;
        
    }
    
    public int searchInsert(int[] arr, int t) {
        
        int n = arr.length;
        
        int l = util(0, n, t, arr);
        if(l>=0 && l <=n-1 && arr[l] < t){
            return l+1;
        }
        return l;
        
    }
}