class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length, c = 1;
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i < n; i++) m.put(arr[i], 1);
        
        while(k != 0){
            if(m.containsKey(c)){
                c++;
            }
            else{
                k--;
                c++;
            }
        }
        return c-1;
    }
}