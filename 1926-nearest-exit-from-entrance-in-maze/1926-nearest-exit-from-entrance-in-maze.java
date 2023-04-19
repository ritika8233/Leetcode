class Solution {
    public int nearestExit(char[][] arr, int[] ent) {
        
        int ans = Integer.MAX_VALUE;
        
        int s = ent[0], e = ent[1], r = arr.length, c = arr[0].length;
        
        if(arr[s][e] == '+') return -1;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {s-1, e} );
        q.add(new int[] {s+1, e} );
        q.add(new int[] {s, e-1} );
        q.add(new int[] {s, e+1} );
        arr[s][e] = '+';
        
        int steps = 0;
        while(q.size() != 0){
            steps++;
            int m = q.size();
            
            for(int k = 0; k < m; k++){
                int[] temp = q.poll();
                int i = temp[0], j = temp[1];
                
                if(i >= 0 && j >= 0 && i < r && j < c && arr[i][j] == '.'){
                    // arr[i][j] = (char)(steps - '0');
                    arr[i][j] = '+';
                    
                    if(i == 0 || j == 0 || i == r-1 || j == c-1) ans = Math.min(ans, steps);
                    
                    // System.out.println(i + "-" + j + "=" + ans);                
                    
                    q.add(new int[] {i-1, j} );
                    q.add(new int[] {i+1, j} );
                    q.add(new int[] {i, j-1} );
                    q.add(new int[] {i, j+1} );
                    
                }
            }
        }
        
       if(ans == Integer.MAX_VALUE) return -1;
        
        return ans;
    }
}