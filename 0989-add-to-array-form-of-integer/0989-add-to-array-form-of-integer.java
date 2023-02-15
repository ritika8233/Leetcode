class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
        
        List<Integer> ans = new ArrayList<>();
        
        int n = arr.length, sum = 0, c = 0 ;
        
        for(int i = n-1; i >=0 ;i--){
            sum = 0;
            if(k != 0){
                sum += k %10;
                k = k/10;
                sum += arr[i];
                sum += c;
                c = sum / 10;
                ans.add(sum%10);
                
            }
            else{
                sum += arr[i];
                sum += c;
                c = sum / 10;
                ans.add(sum%10);
            }
        }
        
        while(k != 0){
            sum = k %10;
            k = k/10;
            sum += c;
            c = sum / 10;
            ans.add(sum%10);
        }
        
        if(c != 0){
            ans.add(c);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}