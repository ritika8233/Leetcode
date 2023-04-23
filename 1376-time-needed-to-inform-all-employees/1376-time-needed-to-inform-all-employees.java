class Solution {
    
    public int util(int i, int n, Map<Integer, List<Integer>> m, int[] time){
        
        int ans = 0;
        
        if(m.get(i) != null){
            for(int itr : m.get(i)){

                ans = Math.max(ans, time[i] + util(itr, n, m, time));

            }
        }
        
        
        
        return ans;
    }
    
    public int numOfMinutes(int n, int head, int[] man, int[] time) {
        
        Map<Integer, List<Integer>> m = new HashMap<>();
        
        for(int i = 0; i < man.length; i++){
            
            List<Integer> temp = m.get(man[i]);
            
            if(temp == null){
                temp = new ArrayList<>();    
            }
            
            temp.add(i);
            m.put(man[i], temp);
        }
        
       return util(head, n, m, time);
        
    }
}