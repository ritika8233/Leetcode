//{ Driver Code Starts
#include <iostream>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    // Function to find equilibrium point in the array.
    // a: input array
    // n: size of array
    int equilibriumPoint(long long arr[], int n) {
        
        int j = n-1, ls = 0, rs = 0;
        
        //  1 3 5 2 2
        //p 1 4 9 11 13
        //s 13 12 9  4 2
        
        for(int i = 0; i < n; i++) rs += arr[i];
        
        for(int i = 0; i < n; i++){
            rs -= arr[i];
            if(ls == rs) return i+1;
            ls += arr[i];
        }
        
        return -1;
    }

};

//{ Driver Code Starts.


int main() {

    long long t;
    
    //taking testcases
    cin >> t;

    while (t--) {
        long long n;
        
        //taking input n
        cin >> n;
        long long a[n];

        //adding elements to the array
        for (long long i = 0; i < n; i++) {
            cin >> a[i];
        }
        
        Solution ob;

        //calling equilibriumPoint() function
        cout << ob.equilibriumPoint(a, n) << endl;
    }
    return 0;
}

// } Driver Code Ends