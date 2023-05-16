class Solution {
    public int[] asteroidCollision(int[] arr) {
        
        int n = arr.length;
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
            //right
            if(s.size() == 0 || arr[i] > 0){
                s.push(arr[i]);
            }
            //left
            else{
                
                while(s.size() != 0){
                    int peek = s.peek();
                    
                    //left
                    if(peek < 0){
                        s.push(arr[i]);
                        break;
                    }
                    else if(peek == -arr[i]){
                        s.pop();
                        break;
                    }
                    else if(peek > -arr[i]){
                        break;
                    }
                    else{
                        s.pop();
                        if(s.size() == 0){
                            s.push(arr[i]);
                            break;
                        }
                    }
                }
                
            }
            
        }
        arr = new int[s.size()];
        int i = s.size()-1;
        while(s.size() != 0){
            arr[i--] = s.pop();
        }
        
        return arr;
    }
}