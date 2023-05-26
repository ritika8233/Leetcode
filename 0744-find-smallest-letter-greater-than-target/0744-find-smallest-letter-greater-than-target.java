class Solution {
    public char nextGreatestLetter(char[] arr, char t) {
        
        int l = 0, r = arr.length-1;
        char ans = arr[0];
        
        while(l <= r){
            
            int m = l + (r-l)/2;
            if(arr[m] > t){
                ans = arr[m];
                r = m-1;
            }
            else{
                l = m+1;
            }
            
        }
        
        return ans;
    }
}