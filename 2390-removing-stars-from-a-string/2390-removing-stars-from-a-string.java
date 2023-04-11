class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length(), i = 0;
        
        while(i < n){
            
            if(s.charAt(i) != '*'){
                st.push(s.charAt(i));
            }
            else{
                if(st.size() != 0) st.pop();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        
        while(st.size() != 0 ){
            sb.append(st.pop());
        }
        sb.reverse();
        
        return sb.toString();
    }
}