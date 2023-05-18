class Solution {
    public int countSeniors(String[] arr) {
        
        int ans = 0, n = arr.length;
        
        for(String s : arr){
            
            int age = s.charAt(11) - '0';
            age = age * 10 + (s.charAt(12) - '0');
            if(age > 60) ans++;
        }
        
        return ans;
    }
}