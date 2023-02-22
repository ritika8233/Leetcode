class Solution {
    
    public boolean util(int[] arr, int t, int d){
        
        int i = 0, n = arr.length, sum = 0, c = 1;
        
        while(i < n){
            
            if(arr[i] + sum <= t){
                sum += arr[i];
            }
            else{
                c++;
                sum = arr[i];
            }
            i++;
            if(c > d)return false;
        }
        
        return true;
    }
    
    
    public int shipWithinDays(int[] arr, int d) {
        
        int n = arr.length, maxi = Integer.MIN_VALUE, sum = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > maxi) maxi = arr[i];
            sum += arr[i];
        }
        
        int ans = 0;
             
        int l = maxi;
        int r = sum + 1;
        
        while( l <= r){
            
            int m = l + (r - l)/2;
                      
            // System.out.println(t + "-" + m + "l and r" + l + " " + r);
            if(util(arr, m, d)){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
            
        }
        
        return ans;
    }
}