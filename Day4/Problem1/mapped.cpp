#include<bits/stdc++.h>
using namespace std;

bool checkMapping(string s1,string s2) {
    unordered_map<char,char> m1;
    unordered_map<char,char> m2;
    if(s1.length()!=s2.length()) return false;
    for(int i=0;i<s1.length();i++) {
        if(m1.find(s1[i])!=m1.end() || m2.find(s2[i])!=m2.end()) {
            if(m1[s1[i]]!=s2[i] || m2[s2[i]]!=s1[i]) {
                return false;
            }
        }
        m1[s1[i]] = s2[i];
        m2[s2[i]] = s1[i];
    }
    return true;
}
int main() {
    string s1,s2;
    cin>>s1>>s2;
    if(checkMapping(s1,s2)) {
        cout<<"true";
    }
    else {
        cout<<"false";
    }
    return 0;
}
