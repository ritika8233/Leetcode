class Solution {
    public boolean validateStackSequences(int[] arr1, int[] arr2) {
        
        int n = arr1.length;
        Stack<Integer> st = new Stack<>();
        
        st.push(arr1[0]);
        int i = 1, j = 0;
        
        while(i < n && j < n){
            
            if(st.size() != 0 && arr2[j] == st.peek()){
                st.pop();
                j++;
            }
            else{
                st.push(arr1[i]);
                i++;
            }
            
        }
        
        
        while(j < n){
            if(st.size() != 0 && arr2[j] == st.peek()){
                st.pop();
                j++;
            }
            else return false;
        }
        
        if(j == n)return true;
        return false;
    }
}