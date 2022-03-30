#include<bits/stdc++.h>
using namespace std;

int main() {
    string s;
    int flag = 0;
    cin>>s;
    map<char,int> m; //aabbcd => a:2, b:2, c:1, d:1
    map<int,int> res; // 2:2, 1:2
    for(int i=0;i<s.length();i++) {
        m[s[i]]++;
    }
    for(auto x: m) {
        res[x.second]++;
    }
    for(auto x: res) {
        if(x.first%2!=0 && x.second>1) {
            flag = 1;
            break;
        }
    }
    if(flag==0) {
        cout<<"YES"<<endl;
    }
    else {
        cout<<"NO"<<endl;
    }
    return 0;
}
