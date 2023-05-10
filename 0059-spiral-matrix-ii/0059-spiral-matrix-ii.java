class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        
        int i = 0, j = 0, r = n, c = n, num = 1;
        
        while(i < r && j < c){
            
            
            //right
            for(int k = j; k < c; k++){
                arr[i][k] = num++;
            }
            i++;
            
            //down
            for(int k = i; k < r; k++){
                arr[k][c-1] = num++;
            }
            c--;
            
            if(i < r && j < c){
                //left
                for(int k = c-1; k >= j; k--){
                    arr[r-1][k] = num++;
                }
                r--;
                
                //up
                for(int k = r-1; k >= i; k--){
                    arr[k][j] = num++;
                }
                j++;
            }
        }
        
        
        return arr;
    }
}