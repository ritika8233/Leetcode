class Solution {
    public int longestPalindrome(String[] arr) {
        
        int n = arr.length;
        
        Map<String, Integer> m = new HashMap<>();
        
        int flag = 0, ans = 0;
        
        for(int i = 0; i < n; i++){
            
            String curr = arr[i];
            
            StringBuilder sb = new StringBuilder(curr);
            sb.reverse();
            
            Integer t = m.get(sb.toString());
            
            if(t != null && t != 0){
                // System.out.println("rev =" + curr + "-" + i);
                flag = 1;
                m.put(sb.toString(), t-1);
                ans += 4;
            }
            else{
                Integer t2 = m.getOrDefault(curr, 0);
                m.put(curr, t2 + 1);
            }
        }
        
        int first = 0;
        
        for(Map.Entry<String, Integer> itr : m.entrySet()){
        
            String curr = itr.getKey();
                        
            if(first == 0 && itr.getValue() > 0){
               if(curr.charAt(0) == curr.charAt(1)){
                   first = 1;
                   ans += 2;
                   
                   // System.out.println(ans + "=" + curr);
               }
            }
            
            
        }
        
        return ans;
    }
}