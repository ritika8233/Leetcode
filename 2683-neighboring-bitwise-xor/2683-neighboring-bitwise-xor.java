class Solution {
    public boolean doesValidArrayExist(int[] arr) {
        
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for(int i = 0; i < n-1; i++){
            
            if(arr[i] == 1){
                if(ans[i] == -1){
                    ans[i] = 0;
                    ans[i+1] = 1;
                }
                else{
                    ans[i+1] = 1 - ans[i];
                }
            }
            else{
                if(ans[i] == -1){
                    ans[i] = 0;
                    ans[i+1] = 0;
                }
                else{
                    ans[i+1] = ans[i];
                }
            }
        }
        
        if((ans[n-1] ^ ans[0]) == arr[n-1]) return true;
        
        return false;
    }
}