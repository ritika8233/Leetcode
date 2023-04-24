class Solution {
    
    public int findJudge(int n, int[][] trust) {
        
        int ans = -1;
        
        if(trust.length == 0 && n > 1)return -1;
        if(trust.length == 0 && n == 1) return 1;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < trust.length; i++){
            adj.get(trust[i][0]).add(trust[i][1]);
        }
        
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(adj.get(i).size() == 0){
                // System.out.println(i);
                temp.add(i);
            }
        }
        
        for(int i = 0; i < temp.size(); i++){
            
            int num = temp.get(i), f = 0;
            
            for(int j = 1; j <= n; j++){
                // if(j == 4) System.out.println(j);
                if(num != j){
                    // if(j == 4) System.out.println(j);
                    int flag = 0;
                    for(int itr : adj.get(j)){
                        if(itr == num){
                            flag = 1;
                            break;
                        }
                    }
                    
                    if(flag == 0){
                        f = 1;
                        break;
                    }  
                }
                
            }
            if(f == 0) return num;
            
        }
        
        
        
        return ans;
    }
}