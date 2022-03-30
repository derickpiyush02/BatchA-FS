#include<bits/stdc++.h>
using namespace std;


int maxLengthLIS(vector<int>v,int dp[]) {
    int n = v.size();
    for(int i=n-1;i>=0;i--) {  
        for(int j=i+1;j<n;j++) {
            if(v[i]<v[j]) {
                dp[i] = max(dp[i],1+dp[j]);
            }
        }
    }
    int res = 0;
    for(int i=0;i<n;i++) {
        if(dp[i]>res) res = dp[i];
    }
    
    return res+1;
}
int main() {
    int x;
    vector<int> v;
    while(cin>>x) {
        v.push_back(x);
        if(cin.get()=='\n') {
            break;
        }
    }
    int dp[v.size()];
    for(int i=0;i<v.size();i++) { //initialising dp array to 0
        dp[i] = 0;
    }
    cout<<maxLengthLIS(v,dp);
    return 0;
}
