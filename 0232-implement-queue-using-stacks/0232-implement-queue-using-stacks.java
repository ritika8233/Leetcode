class MyQueue {

    
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int ans = -1;
        if(s1.size() == 0) return ans;
        while(s1.size() != 0){
            s2.push(s1.pop());
        }
        ans = s2.pop();
        
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public int peek() {
        int ans = -1;
        if(s1.size() == 0) return ans;
        while(s1.size() != 0){
            s2.push(s1.pop());
        }
        ans = s2.peek();
        
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        if(s1.size() == 0)return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */