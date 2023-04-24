class Solution {
    
    public boolean util(int i, int n, int[] arr, int[] vis){
        
        if(i >= n || i < 0) return false;
        
        if(arr[i] == 0) return true;
        if(vis[i] == 1) return false;
        
        vis[i] = 1;
        boolean a = true, b = true;
        
        a = util(i - arr[i], n, arr, vis);
        b = util(i + arr[i], n, arr, vis);
        
        return a||b;
    }
    
    public boolean canReach(int[] arr, int start) {
        
        int n = arr.length;
        int[] vis = new int[n];
        
        return util(start, n, arr, vis);
    }
}