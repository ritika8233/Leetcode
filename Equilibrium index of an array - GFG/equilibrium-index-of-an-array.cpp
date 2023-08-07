//{ Driver Code Starts
#include <iostream>
using namespace std;
#include <stdio.h>
 
int findEquilibrium(int [], int );
 
int main() {
	int T;
	cin>>T;
	while(T--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		cout<<findEquilibrium (a,n)<<endl;
	}
	// your code goes here
	return 0;
}
// } Driver Code Ends


/* You are required to complete this method*/
int findEquilibrium(int arr[], int n)
{
    int ls = 0, rs = 0;
    for(int i = 0; i < n; i++) rs += arr[i];
    //  1 2 0 3
    //p 1 3 0 6
    //s 6 5 0 3
    for(int i = 0; i < n; i++){
        rs -= arr[i];
        if(ls == rs) return i;
        ls += arr[i];
    }
    
    return -1;
}