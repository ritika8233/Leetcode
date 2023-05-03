class Solution {
    public List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        
        int n = arr1.length, m = arr2.length;
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            m1.put(arr1[i], 1);
        }
        
        
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for(int i = 0; i < m; i++){
            
            if(m1.get(arr2[i]) == null) temp1.add(arr2[i]);
            
            m1.put(arr2[i], 1);
            m2.put(arr2[i], 1);
        }
        
        for(int i = 0; i < n; i++){
            if(m2.get(arr1[i]) == null) temp2.add(arr1[i]);
            
            m2.put(arr1[i], 1);
        }
        
        ans.add(temp2);
        ans.add(temp1);
        
        return ans;
    }
}