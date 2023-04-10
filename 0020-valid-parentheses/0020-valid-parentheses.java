class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        int n = s.length(), i = 0;
        
        while(i < n){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.size() == 0)return false;
                if(s.charAt(i) == ')' && st.peek() != '(')return false;
                if(s.charAt(i) == ']' && st.peek() != '[')return false;
                if(s.charAt(i) == '}' && st.peek() != '{')return false;
                st.pop();
            }
            i++;
            
        }
        
        if(st.size() != 0)return false;
        return true;
    }
}