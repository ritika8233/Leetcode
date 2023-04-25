class Solution {
    public int lastStoneWeight(int[] arr) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }
        
        while(pq.size() != 0){
            
            if(pq.size() == 1) return pq.poll();
            
            int a = pq.poll();
            int b = pq.poll();
            
            if(a != b) pq.add(a-b);
        }
        
        return 0;
    }
}