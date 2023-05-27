class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        Map<Integer, Integer> m =  new HashMap<>();
        
        for(int i = n-1; i >= 0; i--){
            int mul = 2 * arr[i];
            Integer t = m.get(mul);
            
            if(t != null) return true;
            
            if(arr[i]%2 == 0){
                if(m.containsKey(arr[i]/2))return true;
            }
            m.put(arr[i], 1);
        }
        
        
        return false;
    }
}