class Solution {
    
    public boolean util(int[][] arr, int i, int j, int r, int c){
        
        if(i < 0 || j < 0 || i >= r|| j >= c)return false;
        
        if(arr[i][j] == 1)return true;
        
        arr[i][j] = 1;
        
        boolean left = false, right = false, top = false, bottom = false;
        
        left = util(arr, i, j-1, r, c);
        right = util(arr, i, j+1, r, c);
        top = util(arr, i-1, j, r, c);
        bottom = util(arr, i+1, j, r, c);
        
        return left && right && top && bottom;
        
    }
    
    public int closedIsland(int[][] arr) {
        
        int ans = 0, r = arr.length, c = arr[0].length;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if( arr[i][j] == 0 && util(arr, i, j, r, c)) ans++;
            }
        }
        
        return ans;
    }
}