class Solution {
    public int removeElement(int[] arr, int val) {
        
        int n = arr.length, l = 0, r = n-1;
        
        while(l <= r){
            if(arr[r] == val){
                r--;
                continue;
            }
            if(arr[l] == val){
                int t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
                r--;
            }
            l++;
        }
        // System.out.println(l + "-" + r);
        return l;
    }
}