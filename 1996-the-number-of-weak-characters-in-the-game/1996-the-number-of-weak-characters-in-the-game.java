class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr, (int[] a, int[] b) -> {
                if(a[0] != b[0]){
                    return a[0]-b[0];
                }
            return b[1]-a[1];
            });

        int n = arr.length, ans = 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i = n-1; i >= 0; i--){
            if(maxi > arr[i][1]){
                ans++;
            }
            maxi = Math.max(maxi, arr[i][1]);
        }
        
        return ans;
    }
}