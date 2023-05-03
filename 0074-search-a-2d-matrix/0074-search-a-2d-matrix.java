class Solution {
    
    public boolean check(int i, int j, int r, int c, int[][] arr, int t){
        
        for(int k = 0; k < c; k++){
            if(arr[i][k] == t) return true;
        }
        
        return false;
    }
    
    public boolean searchMatrix(int[][] arr, int t) {
        
        int r = arr.length, c = arr[0].length, i = 0, j = 0;
        
        j = c-1;
        while(i >= 0 && i < r){
            
            if(arr[i][j] > t){
                return check(i, j, r, c, arr, t);
            }
            else if(arr[i][j] < t){
                i++;
            }
            else return true;
            
        }
        
        return false;
    }
}