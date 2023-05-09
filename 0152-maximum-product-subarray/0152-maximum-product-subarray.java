class Solution {
    public int maxProduct(int[] arr) {
        
        int product = 1, n = arr.length, ans = Integer.MIN_VALUE;;
        
        for (int i = 0; i < n; i++) {
            product *= arr[i];
            ans = Math.max(ans, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
 
        product = 1;
 
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            product *= arr[i];
            ans = Math.max(ans, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        return ans;
    }
}