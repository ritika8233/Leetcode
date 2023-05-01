class Solution {
    
    double mod = 1e5;
    
    public double average(int[] arr) {
        
        double avg = 0;
        
        int n = arr.length;
        double mini = Double.MAX_VALUE, maxi = Double.MIN_VALUE, sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(arr[i] > maxi) maxi = arr[i];
            if(arr[i] < mini) mini = arr[i];
        }
        
        sum -= maxi;
        sum -= mini;
        
        avg = (sum)/(n-2);
        
        System.out.println(sum);
        
        return avg;
    }
}