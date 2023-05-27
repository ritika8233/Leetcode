class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> m = new HashMap<>();
        int n = arr1.length, n2 = arr2.length;
        
        for(int i = 0; i < n; i++){
            Integer t = m.get(arr1[i]);
            if(t == null){
                m.put(arr1[i], 1);
            }
            else{
                m.put(arr1[i], t+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n2; i++){
            Integer t = m.get(arr2[i]);
            if(t != null && t > 0){
                ans.add(arr2[i]);
                m.put(arr2[i], t-1);
            }
        }
        int p = ans.size();
        int[] res = new int[p];
        for(int i = 0; i < p; i++){
            res[i] = ans.get(i);
        }
        
        return res;
    }
}