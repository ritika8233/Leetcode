class Solution {
    public int orangesRotting(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 2){
                    
                    if(j > 0 && arr[i][j-1] == 1){
                        arr[i][j-1] = -1;
                        q.add(new int[] {i, j-1});    
                    }
                    if( j < c-1 && arr[i][j+1] == 1){
                        arr[i][j+1] = -1;
                        q.add(new int[] {i, j+1});    
                    }
                    if(i > 0 && arr[i-1][j] == 1){
                        arr[i-1][j] = -1;
                        q.add(new int[] {i-1, j});    
                    }
                    if(i < r-1 && arr[i+1][j] == 1){
                        arr[i+1][j] = -1;
                        q.add(new int[] {i+1, j});    
                    }
                    
                }
            }
        }
        
        while(q.size() != 0){
            
            int flag = 0;
            ans++;
            
            int m = q.size();
            // System.out.println(m);
            
            for(int k = 0; k < m; k++){
                
                int[] temp = q.poll();
                
                int i = temp[0], j = temp[1];
                
                if(i >= 0 && i < r && j >= 0 && j < c){
                    arr[i][j] = 2;
                    
                    if(j > 0 && arr[i][j-1] == 1){
                        arr[i][j-1] = -1;
                        q.add(new int[] {i, j-1});    
                    }
                    if( j < c-1 && arr[i][j+1] == 1){
                        arr[i][j+1] = -1;
                        q.add(new int[] {i, j+1});    
                    }
                    if(i > 0 && arr[i-1][j] == 1){
                        arr[i-1][j] = -1;
                        q.add(new int[] {i-1, j});    
                    }
                    if(i < r-1 && arr[i+1][j] == 1){
                        arr[i+1][j] = -1;
                        q.add(new int[] {i+1, j});    
                    }
                    // System.out.println(i + "-" + j + "=" + q.size());
                }
            }
            
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 1) return -1;
            }
        }
        
        return ans;
    }
}