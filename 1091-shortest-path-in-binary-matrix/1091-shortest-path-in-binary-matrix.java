class Solution {
    public int shortestPathBinaryMatrix(int[][] arr) {
        
        Queue<int[]> q = new LinkedList<>();
        
        int ans = -1, n = arr.length;
        
        if(arr[0][0] == 1 || arr[n-1][n-1] == 1)return -1;
        int i = 0, j = 0;
        
        q.add(new int[] {i-1, j});
        q.add(new int[] {i+1, j});
        q.add(new int[] {i-1, j-1});
        q.add(new int[] {i+1, j+1});
        q.add(new int[] {i-1, j+1});
        q.add(new int[] {i+1, j-1});
        q.add(new int[] {i, j-1});
        q.add(new int[] {i, j+1});
        
        arr[0][0] = 1;
        
        int steps = 1;
        while(q.size() != 0){
            
            steps++;
            int m = q.size();
            
            for(int k = 0; k < m; k++){
                int[] temp = q.poll();
                int i1 = temp[0], j1 = temp[1];
                
                if(i1 >= 0 && j1 >= 0 && i1 < n && j1 < n && arr[i1][j1] == 0){
                    arr[i1][j1] = steps;
                    
                    q.add(new int[] {i1-1, j1});
                    q.add(new int[] {i1+1, j1});
                    q.add(new int[] {i1-1, j1-1});
                    q.add(new int[] {i1+1, j1+1});
                    q.add(new int[] {i1-1, j1+1});
                    q.add(new int[] {i1+1, j1-1});
                    q.add(new int[] {i1, j1-1});
                    q.add(new int[] {i1, j1+1});
                }
            }
        }
        
        if(arr[n-1][n-1] == 0)return -1;
        
        return arr[n-1][n-1];
    }
}