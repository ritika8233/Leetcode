class Solution {
    
    public void util(int sr, int sc, int r, int c, int[][] arr, int color, int t){
        
        if(sr < 0 || sc < 0 || sr >= r || sc >= c || arr[sr][sc] != t || arr[sr][sc] == color) return;
        
        arr[sr][sc] = color;
        
        if(sr < r-1)
            util(sr+1, sc, r, c, arr, color, t);
        if(sr > 0)
            util(sr-1, sc, r, c, arr, color, t);
        if(sc < c-1)
            util(sr, sc+1, r, c, arr, color, t);
        if(sc > 0)
            util(sr, sc-1, r, c, arr, color, t);
        
    }
    
    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        
        int r = arr.length, c = arr[0].length;
        
        if(sr < 0 || sc < 0 || sr >= r || sc >= c) return arr;
        
        util(sr, sc, r, c, arr, color, arr[sr][sc]);
        
        return arr;
    }
}