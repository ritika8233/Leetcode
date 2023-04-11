class Solution {
    
    public boolean util(char[][] arr, int i, int j, int r, int c){
        
        if(i >= r || j >= c || i < 0 || j < 0 || arr[i][j] == '0') return true;
        
        arr[i][j] = '0';
        
        boolean top = false, bottom = false, right = false, left = false;
        bottom = util(arr, i+1, j, r, c);
        top = util(arr, i-1, j, r, c);
        right = util(arr, i, j+1, r, c);
        left = util(arr, i, j-1, r, c);
        
        return top && bottom && right && left;
        // if(obj.status == true) obj.val += 1;
        
        // return obj.status;
    }
    
    
    public int numIslands(char[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        // Temp obj = new Temp();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == '1' && util(arr, i, j, r, c) == true){
                    ans++;
                }
            }
        }
        
        
        
        return ans;
    }
}