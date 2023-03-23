class Solution {
    public int maxProfit(int[] arr) {
        
        int n = arr.length, ans = 0, buy = 0, sell = 0;
        // System.out.println(arr[buy] + "-" + arr[sell]);
        
        for(int i = 1; i < n; i++){
            
            if(arr[buy] > arr[i]){
                
                ans = Math.max(ans, arr[sell] - arr[buy]);
                // System.out.println(arr[buy] + "-" + arr[sell] + " ");
                buy = i;
                sell = i;
                
            }
            else if(arr[sell] < arr[i]){
                sell = i;
            }
            // System.out.println(arr[buy] + "-" + arr[sell]);
            
        }
        
         ans = Math.max(ans, arr[sell] - arr[buy]);
        return ans;
        
    }
}