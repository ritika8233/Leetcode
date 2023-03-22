class Solution {
    public int minMoves(int[] arr) {
        
        int n = arr.length, ans = 0, mini = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            
            if(mini > arr[i]) mini = arr[i];
            
        }
        
        for(int i : arr){
            ans += i - mini;
        }
        
        return ans;
        
    }
}