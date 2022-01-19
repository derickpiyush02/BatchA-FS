#include<bits/stdc++.h>
using namespace std;

int cnt = 0;

void check(string s) {
    int c = 0;
    if(s.length()==0) return;
    if(s.length()==1) {
        cnt = cnt + 1;
        return;
    }
    unordered_map<char,int> m;
    for(char ch : s) {
        m[ch]++;
    }
    for(auto x : m) {
        if(x.second%2!=0) {
            c++;
            if(c>1) {
                return;
            }
        }
    }
    cnt = cnt+1;
    return;
}
void special(string s) {
    for(int c=0;c<s.length();c++)
    {
        for(int i=1;i<=s.length()-c;i++)
        {
            string d = s.substr(c, i);
            check(d);
        }
    }
}
int main() {
    string s;
    cin>>s;
    special(s);
    cout<<cnt;
    return 0;
}
