class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] v = new int[2001];
        
        for(int i = 0; i < n; i++){
            v[arr[i]+1000]++;
        }
        
        Set<Integer> s = new HashSet<>();
        
        for(int i = 0; i < 2001; i++){
            
            if(v[i] != 0 && s.contains(v[i]) == true){
                //System.out.println(v[i]);
                return false;
            }
            s.add(v[i]);
            
        }
        
        return true;
    }
}