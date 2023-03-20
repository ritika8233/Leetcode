class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        if(n == 0)return true;
        
        int m = arr.length;
        
        int[] vis = new int[m];
        
        for(int i = 0; i < m; i++){
            
            if(arr[i] == 1){
                vis[i] = 1;
                
                if(i - 1 >= 0) vis[i-1] = 1;
                if(i + 1 < m) vis[i+1] = 1;
            }
            
        }
        
        
        for(int i = 0; i < m; i++){
            
            if(n == 0)return true;
            
            if(vis[i] != 1){
                
                n--;
                
                if(i - 1 >= 0) vis[i-1] = 1;
                if(i + 1 < m) vis[i+1] = 1;
            }
            
        }
        
        if(n == 0)return true;
        
        return false;
        
    }
}