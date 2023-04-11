class Solution {
    public boolean isCovered(int[][] arr, int left, int right) {
        
        int[] nums = new int[51];
        
        for(int i = left; i <= right; i++){
            nums[i] = 1;
        }
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            int s = arr[i][0];
            int e = arr[i][1];
            
            for(int j = s; j <= e; j++){
                nums[j] = 0;
            }
        }
        
        for(int i = left; i <= right; i++){
            if(nums[i] == 1)return false;
        }
        
        return true;
    }
}