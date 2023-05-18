class Solution {
    public int matrixSum(int[][] arr) {
        
        int r = arr.length, c = arr[0].length, ans = 0;
        
        for(int i = 0; i < r; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int j = 0; j < c; j++){
                pq.add(arr[i][j]);
            }
            
            for(int j = 0; j < c; j++){
                arr[i][j] = pq.poll();
            }
        }
        
        for(int i = 0; i < c; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int j = 0; j < r; j++){
                pq.add(arr[j][i]);
            }
            
            for(int j = 0; j < r; j++){
                arr[j][i] = pq.poll();
            }
        }
        
        for(int i = 0; i < c; i++){
            ans += arr[0][i];
        }
        
        return ans;
    }
}