class Solution {
    
    

    
    public long zeroFilledSubarray(int[] arr) {
        
        
        int n = arr.length;
        long sub_count = 0;
        for(int i = 0; i < n; i++){
            
            long count = 0;
            while(i < n && arr[i] == 0) {
                count ++;
                i++;
            }
            sub_count += (count * (count + 1))/2;
            if(count > 0) i--;
        }
        
        return sub_count;
        
    }
}