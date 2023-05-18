class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int r = arr.length-1, l = 0, n = arr.length;
        
        while(l <= r){
            int m = l + (r - l) / 2;
            if(m > 0 && m < n-1){
                if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) return m;
                if(arr[m] > arr[m-1]) l = m+1;
                else r = m-1;
            }
            else if(m == 0) l = m+1;
            else r = m-1;
        }
        
        return -1;
    }
}