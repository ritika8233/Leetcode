class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, i = 0, j = 0;
        
        List<Integer> ans = new ArrayList<>();
        
        while(i < r && j < c){

        
            // right
            for(int k = j; k < c; k++){
                ans.add(arr[i][k]);
            }
            i++;
            
            //down
            for(int k = i; k < r; k++){
                ans.add(arr[k][c-1]);
            }
            c--;
            
            if(i < r && j < c){
            //left
                for(int k = c-1; k >= j; k--){
                    ans.add(arr[r-1][k]);
                }
                r--;
                
                //up
                for(int k = r-1; k >= i; k--){
                    ans.add(arr[k][j]);
                }
                j++;
            }
        }
        return ans;
    }
}