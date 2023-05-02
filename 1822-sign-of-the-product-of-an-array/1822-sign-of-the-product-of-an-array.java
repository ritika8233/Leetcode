class Solution {
    public int arraySign(int[] arr) {
        
        int n = arr.length, neg = 0, pos = 0;
        
        
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) return 0;
            if(arr[i] > 0) pos++;
            else neg++;
        }
        
        if(neg % 2 == 0) return 1;
        
        return -1;
    }
}