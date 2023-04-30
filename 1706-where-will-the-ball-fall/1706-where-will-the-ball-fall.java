class Result{
    int val;
    boolean status;
}

class Solution {
    
    public boolean util(int i, int j, int r, int c, int[][] arr, Result res){
        
        if(i < 0 || j < 0 || i >= r || j >= c) {
            res.val = j;
            return res.status = true;
        }
        
        if(arr[i][j] == 1 && j == c-1)return res.status = false;
        if(arr[i][j] == -1 && j == 0) return res.status = false;
        
        // if(i == r-1){
        //     if(arr[i][j] == 1 && arr[i][j] == arr[i][j+1]){
        //         System.out.println();
        //         return true;
        //     }
        //     if(arr[i][j] == -1 && arr[i][j] == arr[i][j-1]){
        //         return true;
        //     }
        //     return false;
        // }
        
        boolean left = false, right = false;
        
        if(arr[i][j] == 1 && arr[i][j] == arr[i][j+1]){
            right = util(i+1,j+1, r, c, arr, res);
        }
        else if(arr[i][j] == -1 && arr[i][j] == arr[i][j-1]){
            left =  util(i+1, j-1, r, c, arr, res);
        }
        
        return res.status = left || right;
    }
    
    public int[] findBall(int[][] arr) {
        
        int r = arr.length, c = arr[0].length;
        int[] ans = new int[c];
        
        for(int i = 0; i < c; i++){
            Result res = new Result();
            boolean flag = util(0, i, r, c, arr, res);
            // System.out.println(ans);
            if(flag == true){
                ans[i] = res.val;
            }
            else ans[i] = -1;
        }
        
        return ans;
    }
}