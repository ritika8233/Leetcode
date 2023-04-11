class Solution {
    public int[] runningSum(int[] arr) {
        
        int n = arr.length;
        int[] prev = new int[n];
        prev[0] = arr[0];
        
        for(int i = 1; i < n; i++){
            prev[i] = prev[i-1] + arr[i];
        }
        
        return prev;
    }
}