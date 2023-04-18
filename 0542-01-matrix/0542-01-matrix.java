class Solution {
    public int[][] updateMatrix(int[][] arr) {
        
        int r = arr.length, c = arr[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 0){
                    q.add(new int[] { i+1, j } );
                    q.add(new int[] { i-1, j } );
                    q.add(new int[] { i, j-1 } );
                    q.add(new int[] { i, j+1 } );
                }
                else{
                    arr[i][j] = -1;
                }
            }
        }
        
        int steps = 1, flag = 0;
        
        while(q.size() != 0){
            flag = 0;
            int m = q.size();
            for(int i = 0; i < m; i++){
                int[] temp = q.poll();
                
                int i1 = temp[0], j1 = temp[1];
                
                if(i1 >= 0 && j1 >= 0 && i1 < r && j1 < c && arr[i1][j1] == -1){
                    flag = 1;
                    arr[i1][j1] = steps;
                    
                    q.add(new int[] { i1+1, j1 } );
                    q.add(new int[] { i1-1, j1 } );
                    q.add(new int[] { i1, j1-1 } );
                    q.add(new int[] { i1, j1+1 } );
                }
            }
            
            if(flag == 1)steps++;
        }
        
        return arr;
    }
}