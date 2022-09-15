class Solution {
    public int[] findOriginalArray(int[] arr) {
        
        int n = arr.length;
        
        if(n == 1 || (n%2 != 0))return new int[0];
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            Integer t = m.get(arr[i]);
            
            if(t == null){
                m.put(arr[i], 1);
            }
            else{
                m.put(arr[i], t+1);
            }
            
        }
        
        int[] ans = new int[n/2];
        int j = 0;
        
        for(int i = 0; i < n; i++){
            
            //System.out.println(i);
            
             Integer t = m.get(arr[i]);
            
            
            if(t != null && t != 0){
               //  System.out.println(arr[i] + "-" + arr[i]*2);
                t--;
                Integer p = m.get(arr[i] * 2);
                
                if(p == null || p == 0)return new int[0];
                
             //   System.out.print(arr[i] + "-" + arr[i]*2);
                
                if(arr[i]*2 == arr[i]){
                    if(t == 0)return new int[0];
                    t--;
                    m.put(arr[i], t);
                //    System.out.println(arr[i] + "-" + t);
                }
                else{
                    m.put(arr[i]*2, p-1);
                    m.put(arr[i], t);
                 //   System.out.println(m.get(arr[i]*2));
                }
                
                ans[j] = arr[i];
                j++;
            }
            
        }
        
        return ans;
    }
}