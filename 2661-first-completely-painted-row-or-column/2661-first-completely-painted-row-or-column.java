class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {

        
        int n = arr.length, r = mat.length, c = mat[0].length;
        
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> row_count = new HashMap<>();
        Map<Integer, Integer> col_count = new HashMap<>();
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                row.put(mat[i][j] ,i);
                col.put(mat[i][j], j);
            }
        }
        
        for(int i = 0; i < n; i++){
            int num = arr[i];
            
            Integer r_count = row_count.getOrDefault(row.get(num), 0);
            row_count.put(row.get(num), r_count+1);
            
            Integer c_count = col_count.getOrDefault(col.get(num), 0);
            col_count.put(col.get(num), c_count+1);
            
            if(r_count+1 == c)return i;
            if(c_count+1 == r)return i;
        }
        
        return -1;
    }
}