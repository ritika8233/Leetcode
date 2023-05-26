class Solution {
    public int[] twoSum(int[] arr, int t) {
        
        int l = 0, r = arr.length-1;
        int[] ans = new int[2];
        
        while(l < r){
            int sum = arr[l]+arr[r];
            if(sum == t){
                ans[0] = l+1;
                ans[1] = r+1;
                return ans;
            }
            if(sum > t){
                r--;
            }
            else l++;
        }
        return ans;
    }
}