class Solution {
    public int diagonalSum(int[][] arr) {
        
        int r = arr.length, c = arr[0].length;
        
        int sum = 0, i = 0, j = 0, odd = 0;
        
        //left to right diag
        while(i < r && j < c){
            sum += arr[i][j];
            i++;
            j++;
            odd++;
        }
        
        int flag = 0;
        
        if(odd % 2 != 0){
            flag = 1;
            odd = odd / 2;
        }
        
        i = 0; j = c-1;
        
        int count = 1;
        
        //right to left diag
        while(i < r && j >= 0){
            
            if(flag == 1 && count == odd+1){
                count++;
                i++;
                j--;
                continue;
            }
            
            sum += arr[i][j];
            i++;
            j--;
            count++;
        }
        
        return sum;
    }
}