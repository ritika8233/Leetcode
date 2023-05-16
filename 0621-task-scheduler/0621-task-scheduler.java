class Solution {
    public int leastInterval(char[] arr, int n) {
        
        int time = 0;
        
        int[] freq = new int[26];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(char i : arr){
            freq[i - 'A']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                pq.add(freq[i]);
            }
        }
        
        while(pq.size() != 0){
            
            int cycle = n+1;
            List<Integer> temp = new ArrayList<>();
            
            while(cycle != 0 && pq.size() != 0){   
                int peek_freq = pq.poll();
                
                if(peek_freq > 1){
                    temp.add(peek_freq-1);
                }
                time++;
                cycle--;
            }
            
            for(int itr : temp){
                pq.add(itr);
            }
            if(pq.size() == 0)break;
            time += cycle;
        }
        
        return time;
    }
}