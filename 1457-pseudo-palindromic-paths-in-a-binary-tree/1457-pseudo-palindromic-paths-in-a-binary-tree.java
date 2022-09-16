class Solution {
    
    int freq[];
    
    
    public int util(TreeNode root){
        
        if(root == null)return 0;
        
        if(root.left == null && root.right == null){
            
            freq[root.val]++;
            
            int flag = 0;
            
            for(int i = 1; i <= 9; i++){
                
                if(freq[i] % 2 != 0 && flag == 1){
                    flag = 2;
                    break;
                }
                else if(freq[i] % 2 != 0 && flag == 0){
                    flag = 1;
                }
                
            }
            
            freq[root.val]--;
            
            if(flag == 2)return 0;
            
            return 1;
            
        }
        
        int ans = 0;
        
        freq[root.val]++;
        ans += util(root.left);
        ans += util(root.right);
        freq[root.val]--;
        
        return ans;
    }
    
    public int pseudoPalindromicPaths (TreeNode root) {
        
        if(root.left == null && root.right == null)return 1;
        
        freq = new int[10];
        
        return util(root);
        
    }
}