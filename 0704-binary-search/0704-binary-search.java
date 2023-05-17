class Solution {
    public int search(int[] arr, int t) {
        
        int r = arr.length-1, l = 0;
        while(l <= r){
            int m = l + (r - l) /2;
            if(arr[m] == t)return m;
            
            if(arr[m] > t) r = m-1;
            else l = m+1;
        }
        
        return -1;
    }
}