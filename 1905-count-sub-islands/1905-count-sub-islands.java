class Solution {    
    
    public boolean check(int i, int j, int r, int c, int[][] arr2, int[][] arr1){
        
        if(i < 0 || j < 0 || i >= r || j >= c) return true;
        
        if(arr1[i][j] != 1  && arr2[i][j] == 1) return false;
        
        if(arr2[i][j] == 0) return true;
        
        arr2[i][j] = 0;
        
        boolean left = false, right = false, top = false, bottom = false;
        
        left = check(i, j-1, r, c, arr2, arr1);
        right = check(i, j+1, r, c, arr2, arr1);
        top = check(i-1, j, r, c, arr2, arr1);
        bottom = check(i+1, j, r, c, arr2, arr1);
        
        return left && right && top && bottom;
    }
    
    public int countSubIslands(int[][] arr1, int[][] arr2) {
        
        int r = arr1.length, c = arr1[0].length, ans = 0;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr2[i][j] == 1 && arr1[i][j] == 1){
                    // System.out.println(i + "-" + j + "=" + ans);
                    if(check(i, j, r, c, arr2, arr1)){
                        ans++;
                    }
                }
            }
        }
        
        return ans;
    }
} 