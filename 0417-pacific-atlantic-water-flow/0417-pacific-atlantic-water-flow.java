class Solution {
    
    public void bfs(int i, int j, boolean[][] vis, int[][] arr){
        
        int r = arr.length;
        int c = arr[0].length;
        
        if(i < 0 || j < 0 || i >= r || j >= c || vis[i][j] == true) return;
        
        vis[i][j] = true;
        
        // left
        if(j > 0 && arr[i][j-1] >= arr[i][j]) bfs(i, j-1, vis, arr);
        //right
        if(j < c-1 && arr[i][j+1] >= arr[i][j]) bfs(i, j+1, vis, arr);
        //top
        if(i > 0 && arr[i-1][j] >= arr[i][j]) bfs(i-1, j, vis, arr);
        //bottom
        if(i < r-1 && arr[i+1][j] >= arr[i][j]) bfs(i+1, j, vis, arr);
        
    }
    
    public List<List<Integer>> pacificAtlantic(int[][] arr) {
        
        int r = arr.length, c = arr[0].length;
        
        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == 0 || j == 0) bfs(i, j, pacific, arr);
                if(i == r-1 || j == c-1) bfs(i, j, atlantic, arr);
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(pacific[i][j] == true && atlantic[i][j] == true){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }
        
        return ans;
    }
}