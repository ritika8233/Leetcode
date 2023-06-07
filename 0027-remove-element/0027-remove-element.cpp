class Solution {
public:
    int removeElement(vector<int>& a, int val) {
        int c=0,n=a.size();
        int i=-1;
        for(int j=0;j<n;j++){
          if(a[j]!=val){
              c++;
              i++;
              swap(a[i],a[j]);
          }   
        }
        return c;
    }
};