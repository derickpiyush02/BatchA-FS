#include<iostream>
#include<unordered_map>
using namespace std;

int main() {
    string s;
    cin>>s;
    int odd = 0;
    int l = 0;
    int flag = 0;
    unordered_map<char,int> m;
    for(int i=0;i<s.length();i++) {
        m[s[i]]++;
    }
    for(auto x : m) {
        if(x.second%2==0) {
            l = l + x.second;
            flag = 1;
        }
        else if(x.second%2!=0 && x.second>2) {
            l = l + (x.second-1);
        }
        else {
            odd = 1;
        }
    }
    cout<<l+odd<<endl;
    return 0;
}
